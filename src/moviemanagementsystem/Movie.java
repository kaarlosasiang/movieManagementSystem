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
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import static java.nio.file.StandardOpenOption.APPEND;
import javax.swing.table.DefaultTableModel;

public class Movie {

    //class properties
    private int movieId;
    private String title;
    private String yearReleased;
    private String director;
    private String actor;
    private String plotOutline;
    private String genre;

    /*
     * Constructor
     */
    public Movie() {

    }

    public Movie(int movieId, String title, String yearReleased, String director, String actor, String plotOutline, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.yearReleased = yearReleased;
        this.director = director;
        this.actor = actor;
        this.plotOutline = plotOutline;
        this.genre = genre;
    }

    /*
     * Get Methods
     */
    public int getMovieId() {
        return this.movieId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYearReleased() {
        return this.yearReleased;
    }

    public String getDirector() {
        return this.director;
    }

    public String getActor() {
        return this.actor;
    }

    public String getPlotOutline() {
        return this.plotOutline;
    }

    public String getGenre() {
        return this.genre;
    }

    /*==================================
    add movie method
        will add the credentials to the txt file
     ===================================*/
    public void addMovie(String title, String yearReleased, String director, String actor, String plotOutline, String genre) {
        int id;
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/movie.txt").toAbsolutePath();
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            InputStream inputs = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            String line;
            id = 1;
            while ((line = reader.readLine()) != null) {
                StringTokenizer stn = new StringTokenizer(line, ",");
                String[] movies = line.split("/"); // returns an array of movie data from the text file

                id = Integer.parseInt(movies[0]);
                id++;
            }
            writer.write(id + "/" + title + "/" + yearReleased + "/"
                    + director + "/" + actor + "/" + plotOutline + "/"
                    + genre);
            writer.newLine();
            System.out.println("Movie Added!");
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
    public void displayMovie(DefaultTableModel model) {
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/movie.txt").toAbsolutePath();
            InputStream inputs = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            Object[] mLists = reader.lines().toArray();
            for (Object data : mLists) {
                String line = data.toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
        } catch (Exception e) {

        }

    }

    public void displayRecent(DefaultTableModel model) {
        try {
            Path path = Paths.get("src/moviemanagementsystem/Database/movie.txt").toAbsolutePath();
            InputStream inputs = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            Object[] mLists = reader.lines().toArray();
            for (Object data : mLists) {
                String line = data.toString().trim();
                String[] dataRow = line.split("/");
                String title = dataRow[1];
                String director = dataRow[3];
                String actor = dataRow[4];
                String genre = dataRow[6];
                String[] recent = new String[]{title,director,actor,genre};
                model.addRow(recent);
            }
        } catch (Exception e) {

        }

    }
    
    /*==================================
    update method
        will update the current object
     ===================================*/
    public void updateMovie(int movieId, String newTitle, String newYearReleased, String newDirector, String newActor, String newPlotOutline, String newGenre) {

        try {
            File inputFile = new File("src/moviemanagementsystem/Database/movie.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split("/");
                int id = Integer.parseInt(lineParts[0]);
                if (id == movieId) {
                    writer.write(movieId + "/" + newTitle + "/" + newYearReleased + "/" + newDirector +  "/"+ newActor +  "/"  + newPlotOutline +  "/" + newGenre + System.getProperty("line.separator"));
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
    public void deleteMovie(int movieId) {
        try {
            File inputFile = new File("src/moviemanagementsystem/Database/movie.txt");
            File tempFile = new File("src/moviemanagementsystem/Database/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] lineParts = currentLine.split("/");
                int id = Integer.parseInt(lineParts[0]);
                if (id != movieId) {
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
    search method
        will search the current object based 
        on its id
     ===================================*/
    public boolean isFound(int id) {

        // Flag to track if the ID was found
        boolean isFound = false;

        try {
            //File directory
            Path path = Paths.get("src/codebytersdirectorysystem/Database/members.txt").toAbsolutePath();
            InputStream inputs = Files.newInputStream(path);
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputs));

            // Read each line of the file
            String line = reader.readLine();
            while (line != null) {
                // Split the line into fields separated by a comma
                String[] fields = line.split("/");

                // Check if the first field (the ID) matches the search ID
                if (fields[0].equals(Integer.toString(id))) {
                    // ID was found, set the flag and print the line
                    isFound = true;
                }
                // Read the next line
                line = reader.readLine();
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return isFound;
    }
}
