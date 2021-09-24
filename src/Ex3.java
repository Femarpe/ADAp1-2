import java.io.File;

public class Ex3 {
    public void prueba(String ruta) {

        File file = new File(ruta);
        if ((file.exists())&&(file.isDirectory())) {
            File[] listaDeFicheros;
            listaDeFicheros = file.listFiles();

            for (int i = 0; i < listaDeFicheros.length; i++) {
                System.out.println(listaDeFicheros[i].getName());
            }
        } else {
            System.out.println("el directorio expecificado no existe");
        }
    }
}
