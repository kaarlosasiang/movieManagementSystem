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
public class Actor {

    private String actorId;
    private String name;
    private String bDate;
    private String qoutes;

    public Actor() {

    }

    public Actor(String actorId, String name, String bDate, String qoutes) {
        this.actorId = actorId;
        this.name = name;
        this.bDate = bDate;
        this.qoutes = qoutes;
    }

    public String getActorId() {
        return this.actorId;
    }

    public String getName() {
        return this.name;
    }

    public String getBDate() {
        return this.bDate;
    }

    public String getQoutes() {
        return this.qoutes;
    }
    
     /*==================================
    add actor method
        will add the credentials to the txt file
     ===================================*/
    public void addActor(String name, String bDate, String qoutes) {
        int id;
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/actors.txt").toAbsolutePath();
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
            writer.write(id + "," + name + "," + bDate + "," + qoutes);
            writer.newLine();
            System.out.println("Actor Added!");
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
    public void displayActor(DefaultTableModel model) {
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/actors.txt").toAbsolutePath();
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
    public void updateActor(int actorId, String name, String bDate, String qoutes) {

        try {
            File inputFile = new File("src/moviemanagementsystem/Database/actors.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split(",");
                int id = Integer.parseInt(lineParts[0]);
                if (id == actorId) {
                    writer.write(actorId + "," + name + "," + bDate + "," + qoutes + System.getProperty("line.separator"));
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
    public void deleteActor(int actorId) {
        try {
            File inputFile = new File("src/moviemanagementsystem/Database/actors.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split(",");
                int id = Integer.parseInt(lineParts[0]);
                if (id != actorId) {
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
