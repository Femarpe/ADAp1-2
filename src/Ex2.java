import java.io.File;

public class Ex2 {
    public void prueba() {

        File file = new File(".");
        File[] listaDeFicheros;
        listaDeFicheros = file.listFiles();

        for (int i = 0; i < listaDeFicheros.length; i++) {
            System.out.println(listaDeFicheros[i].getName());
        }
    }
}
