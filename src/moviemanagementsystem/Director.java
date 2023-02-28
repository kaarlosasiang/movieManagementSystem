/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviemanagementsystem;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Director {
     private String directorId;
    private String name;
    private String bDate;
    private String movies;

    public Director() {

    }

    public Director(String directorId, String name, String bDate, String movies) {
        this.directorId = directorId;
        this.name = name;
        this.bDate = bDate;
        this.movies = movies;
    }

    public String getDirectorId() {
        return this.directorId;
    }

    public String getName() {
        return this.name;
    }

    public String getBDate() {
        return this.bDate;
    }

    public String getMovies() {
        return this.movies;
    }
    
     /*==================================
    add actor method
        will add the credentials to the txt file
     ===================================*/
    public void addDirector(String name, String bDate, String movies) {
        int id;
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/director.txt").toAbsolutePath();
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            InputStream inputs = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            String line;
            id = 1;
            while ((line = reader.readLine()) != null) {
                StringTokenizer stn = new StringTokenizer(line, ",");
                String[] actors = line.split(","); // returns an array of movie data from the text file

                id = Integer.parseInt(actors[0]);
                id++;
            }
            writer.write(id + "," + name + "," + bDate + "," + movies);
            writer.newLine();
            System.out.println("Director Added!");
            writer.close();
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    
    /*==================================
    dispaly method
        will display the current object
     ===================================*/
    public void displayDirector(DefaultTableModel model) {
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/director.txt").toAbsolutePath();
            InputStream inputs = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            Object[] aLists = reader.lines().toArray();
            for (Object data : aLists) {
                String line = data.toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        } catch (Exception e) {

        }

    }/*==================================
    update method
        will update the current object
     ===================================*/
    public void updateDirector(int directorId, String name, String bDate, String movies) {

        try {
            File inputFile = new File("src/moviemanagementsystem/Database/director.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split(",");
                int id = Integer.parseInt(lineParts[0]);
                if (id == directorId) {
                    writer.write(directorId + "," + name + "," + bDate + "," + movies + System.getProperty("line.separator"));
                } else {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /*==================================
    delete method
        will delete the current object
     ===================================*/
    public void deleteDirector(int directorId) {
        try {
            File inputFile = new File("src/moviemanagementsystem/Database/director.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split(",");
                int id = Integer.parseInt(lineParts[0]);
                if (id != directorId) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
