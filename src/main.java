import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws URISyntaxException, IOException, UtilityFileException {
        Utils utils = new Utils();

        Ex4 ex4 = new Ex4();

        ex4.prueba();

        /*
        Ex5 ex5 = new Ex5();
        System.out.println("inserte las rutas de los directorios a comparar");

        System.out.println("Directorio A:");
        File folderA = new File(utils.scanner.nextLine());

        System.out.println("Directorio B:");
        File folderB = new File(utils.scanner.nextLine());

        utils.separador();

        ex5.setFolders(folderA, folderB);
        boolean equals = ex5.compare();
        if (equals == true) {
            System.out.println("los directorios " + ex5.getFolderA().getName() + " y " + ex5.getFolderB().getName() + " son iguales");
        } else {
            System.out.println("los directorios " + ex5.getFolderA().getName() + " y " + ex5.getFolderB().getName() + " no son iguales");
        }

         */

    }
}
