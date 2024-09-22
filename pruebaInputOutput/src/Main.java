import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\testIO\\test.txt", true);
        String greeting = "Hello World!\n";

        fileOutputStream.write(greeting.getBytes());
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("E:\\testIO\\test.txt");

        int i;

        while ((i = fileInputStream.read()) != -1) {
            System.out.println((char) i);
        }
    }
}