package cz.spsmb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("names.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.append("Radek\r\nPavel");
        }
        catch (IOException e){
            System.out.println("Nefunguje ti to :)))");
        }
        finally {
            System.out.println("TADY.");

        }

        Scanner scanner = new Scanner(file);
        int i = 0;
        String[] data = new String[2];
        while (scanner.hasNextLine()){
            data[i] = scanner.nextLine();
            i++;
        }
        scanner.close();
        System.out.println(data[1]);

        try {

            Thread.sleep(1000L);
            System.out.println(Files.deleteIfExists(file.toPath()));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
