import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws URISyntaxException, IOException, UtilityFileException {

        Ex9 ex9 = new Ex9();
        String[] titulos = {"Les tenebres i l'alba", "El Quixot de la Manxa", "El Senyor dels Anells", "El petit príncep"};
        int anyoPublicacion[] = {2020, 1605, 1954, 1943};
        ex9.prueba(titulos,anyoPublicacion);

        /*Utils utils = new Utils();

        Ex8 ex8 = new Ex8();
        ex8.escritor();
        */
        /*
        Ex7 ex7 = new Ex7();
        ex7.escritor();
        */

        /*
        String path = "C:\\Prueba\\holamundo.txt";

        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1){
            System.out.println(((char) i));
        }
        fileReader.close();
        */
        /*
        Què fa aquesta funció?
            a) Què fa aquesta funció? Quina classe de flux s'utilitza?
                Este metodo lee el fichero del cual se ha pasado la ruta y muestra en consola su contenido letra por letra.
                Quina classe de flux s'utilitza?
                El flujo de caracteres de tipo texto que esta por defecto en el sistema operativo

            b) Per quése utilitza la classe FileReader?
                Se utiliza para leer el flujo de caracteres del fichero, lo que hace en concreto el FileReade frente a InputStreamReader es que sinplifica la tarea al programador eligiendo el tipo de flujo de datos nativo del sistema.

            c) Què fa el mètode read() ?
                El metodo read devuelbe el valor de cada caracter del dichero en un numero

            d) Per qué el main s'ha afegit una excepció?
                Se ha añadido para prevenir potenciales errores al generar el objeto file

                Hi ha alguna manera de llevar el throws IOException?
                si, utilizando un try catch

            e) A què fa referència el -1 en la comprovació del while?
                A que la primera posicion de un fichero es la 0 asi que mientra que la posicion no sea negativa seguira leyendo
            f) Per quées necessari usar el mètode close()?
                para que no siga consumiendo memoria
         */






        /*Ex4 ex4 = new Ex4();

        ex4.prueba();
        */
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
