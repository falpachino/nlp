import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TokenizationWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Let's pause, and then reflect.");
        List<String> list = new ArrayList<>();
        scanner.useDelimiter("[ ,.]");

        while (scanner.hasNext()) {
            String token = scanner.next();
            list.add(token);
        }
        
        for (String token : list) {
            System.out.println(token);
        }
        
        scanner.close();
    }
}
