import java.util.Scanner;

public class ScannerFromString {
    public static void main(String[] args) {
        String data = "Hello, this is a test string.";
        Scanner scanner = new Scanner(data);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
