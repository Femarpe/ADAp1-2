import java.io.File;
import java.io.IOException;

public class Ex6 {
    public void prueba() throws IOException {
        boolean salir = false;
        Utils utils = new Utils();
        String ruta;
        do {

            System.out.println("Elija una opcion \n 1-crear directorio \n 2-crear archivo \n 3-borrar \n 4-info fichero \n 5-Comparar ficheros \n 6-salir");
            String eleccion = utils.scanner.nextLine();

            if (eleccion.equals("1")) {

                System.out.println("introduca la ruta del directorio a crear");
                ruta = utils.scanner.nextLine();
                File file = new File(ruta);
                file.mkdir();

            } else if (eleccion.equals("2")) {

                System.out.println("introduca la ruta del archivo a crear");
                ruta = utils.scanner.nextLine();
                File file = new File(ruta);
                file.createNewFile();

            } else if (eleccion.equals("3")) {

                System.out.println("introduca la ruta del directorio a borrar");
                ruta = utils.scanner.nextLine();
                File file = new File(ruta);
                file.delete();

            } else if (eleccion.equals("4")) {

                System.out.println("introduca la ruta del fichero a desglosar");
                ruta = utils.scanner.nextLine();
                File fileMostrar = new File(ruta);
                System.out.println(fileMostrar.getName());
                System.out.println(fileMostrar.getPath());
                System.out.println(fileMostrar.getAbsolutePath());
                System.out.println(fileMostrar.length());
                System.out.println(fileMostrar.getParent());

                if (fileMostrar.isDirectory()) {
                    System.out.println("es un directorio");
                } else {
                    System.out.println("es un fichero");
                }

                if (fileMostrar.canRead()) {
                    System.out.println("se puede leer");
                } else {
                    System.out.println("no se puede leer");
                }

                if (fileMostrar.canWrite()) {
                    System.out.println("se puede escribir");
                } else {
                    System.out.println("no se puede escribir");
                }


            } else if (eleccion.equals("5")) {
                System.out.println("introduca la ruta del primer archivo a comparar");
                String ruta1 = utils.scanner.nextLine();

                System.out.println("introduca la ruta del segundo archivo a comparar");
                String ruta2 = utils.scanner.nextLine();
                
            } else if (eleccion.equals("6")) {
                salir = true;
            }
        } while (salir == false);
    }
}
