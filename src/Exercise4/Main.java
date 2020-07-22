package Exercise4;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final String workingDir = System.getProperty("user.dir");
        final String fileName = "deleteMe.txt";

        File file = new File(workingDir + File.separator + fileName);

        file.createNewFile();

        if (file.exists()) {
            System.out.println("File successfully created");
        } else {
            System.out.println("File not created");
        }


        file.delete();
        if (!file.exists()) {
            System.out.println("File successfully deleted");
        } else {
            System.out.println("Something went wrong");
        }


    }
}
