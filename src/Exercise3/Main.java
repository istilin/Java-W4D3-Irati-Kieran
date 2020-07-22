package Exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        final String workingDir = System.getProperty("user.dir");
        final String fileToRead = workingDir + File.separator + "src" + File.separator + "readme.txt";

        File file = new File(fileToRead);
        Scanner scanner = new Scanner(file);

        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
        }
        scanner.close();

        System.out.println(stringBuilder.toString());
    }
}
