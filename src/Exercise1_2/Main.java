package Exercise1_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String workingDir = System.getProperty("user.dir");

        File newDirectory = new File(workingDir);

        if (newDirectory.mkdir()) {
            System.out.printf("Directory successfully created: %s", newDirectory.getCanonicalPath());
        } else if (newDirectory.exists()) {
            System.out.printf("Directory path already exists at: %s", newDirectory.getCanonicalPath());
        } else {
            System.out.println("Unable to create directory");
        }

        File file = new File(workingDir + File.separator + "myFile.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Hello World");
        writer.close();
        System.out.println("Wrote to file!");
    }

}
