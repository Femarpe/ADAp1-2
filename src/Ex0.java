import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class Ex0 {

    public void prueba() throws URISyntaxException {
        URI uri = new URI("file:///C:/Horario.html");
        File file1 = new File(uri);
        System.out.println(file1.getAbsolutePath());

        File file2 = new File(".");
        System.out.println(file2.getAbsolutePath());

        File file3 = new File("Parent", "child");
        System.out.println(file3.getAbsolutePath());

        File fileparent = new File(".");
        File file4 = new File(fileparent, "child");
        System.out.println(file4.getAbsolutePath());

        /**
         Ex0 ex0 = new Ex0();
         ex0.prueba();

         utils.separador();

         Ex1 ex1 = new Ex1();
         ex1.prueba();

         utils.separador();


         Ex2 ex2 = new Ex2();
         ex2.prueba();

         utils.separador();

         Ex3 ex3 = new Ex3();
         System.out.println("introduce una ruta de archivo");
         String ruta = utils.scanner.nextLine();
         ex3.prueba(ruta);

         utils.separador();

         */

    }
}

