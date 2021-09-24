import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ex5Test {

    @Test
    void main() throws UtilityFileException {
        Utils utils = new Utils();

        ArrayList<String> listaRutas1 = new ArrayList<>();
        ArrayList<String> listaRutas2 = new ArrayList<>();

        listaRutas1.add("c:/p1");
        listaRutas1.add("c:/prueba/p2");
        listaRutas1.add("c:/prueba/p1");
        listaRutas1.add("jhbfhwjef");

        listaRutas2.add("c:/prueba/p1");
        listaRutas2.add("c:/p1");
        listaRutas2.add("c:/prueba/p2");
        listaRutas2.add("c:/prueba/p2");

        for (int i = 0; i < listaRutas1.size() && listaRutas1.size() == listaRutas2.size(); i++) {

            Ex5 ex5 = new Ex5();
            System.out.println("rutas de los directorios a comparar");

            System.out.println("Directorio A:" + listaRutas1.get(i));
            File folderA = new File(listaRutas1.get(i));

            System.out.println("Directorio B:"+ listaRutas2.get(i));
            File folderB = new File(listaRutas2.get(i));


            ex5.setFolders(folderA, folderB);
            boolean equals = ex5.compare();
            if (equals == true) {
                System.out.println("los directorios " + ex5.getFolderA().getName() + " y " + ex5.getFolderB().getName() + " son iguales");
            } else {
                System.out.println("los directorios " + ex5.getFolderA().getName() + " y " + ex5.getFolderB().getName() + " no son iguales");
            }
            utils.separador();
        }
    }
}