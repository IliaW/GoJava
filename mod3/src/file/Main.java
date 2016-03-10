package file;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Adding objects
        File audioFile = new AudioFile("Biber.mp3");
        File textFile = new TextFile("Kursach.docs");
        File imageFile = new ImageFile("Shakal.jpeg");

        // Creating files array
        ArrayList<File> files = new ArrayList<>();
        files.add(audioFile);
        files.add(textFile);
        files.add(imageFile);

        // Creating directory object and setting the files array
        Directory directory = new Directory();
        directory.setFiles(files);

        // Print files from directory
        System.out.println("Directory:");
        for (File file : directory.getFiles()) {
            System.out.println(file.getName());
        }
    }
}