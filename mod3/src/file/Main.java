package file;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        File audioFile = new AudioFile("Biber.mp3");
        File textFile = new TextFile("Kursach.docs");
        File imageFile = new ImageFile("Shakal.jpeg");

        ArrayList<File> files = new ArrayList<>();
        files.add(audioFile);
        files.add(textFile);
        files.add(imageFile);

        Directory directory = new Directory();
        directory.setFiles(files);

        System.out.println("Directory:");
        for (File file : directory.getFiles()) {
            System.out.println(file.getName());
        }
    }
}
