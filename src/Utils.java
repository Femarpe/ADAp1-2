import java.util.Scanner;

public class Utils {
    public Scanner scanner = new Scanner(System.in);

    public void separador() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
