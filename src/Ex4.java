import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Ex4 {
    public void prueba() throws IOException {
        boolean salir = false;
        Utils utils = new Utils();
        String ruta;
        do {
            System.out.println("Elija una opcion \n 1-crear directorio \n 2-crear archivo \n 3-borrar \n 4-salir");
            String eleccion = utils.scanner.nextLine();

            if (eleccion.equals("1")){
                System.out.println("introduca el nombre del directorio a crear");
                ruta = "C:\\Users\\kurur\\Desktop\\Insti 2020\\AD\\webappP2\\ADAp1-2\\Pruebas\\" + utils.scanner.nextLine();
                File file = new File(ruta);
                file.mkdir();
            } else  if (eleccion.equals("2")){
                System.out.println("introduca el nombre del archivo a crear");
                ruta = "C:\\Users\\kurur\\Desktop\\Insti 2020\\AD\\webappP2\\ADAp1-2\\Pruebas\\" + utils.scanner.nextLine();
                File file = new File(ruta);
                file.createNewFile();
            } else  if (eleccion.equals("3")){
                System.out.println("introduca el nombre del directorio a borrar");
                ruta = "C:\\Users\\kurur\\Desktop\\Insti 2020\\AD\\webappP2\\ADAp1-2\\Pruebas\\" + utils.scanner.nextLine();
                File file = new File(ruta);
                file.delete();
            } else  if (eleccion.equals("4")){
                salir = true;
            }
        } while (salir == false);
    }
}
