import java.io.File;

public class Ex1 {
    public void prueba() {
        File file = new File("file:///C:/Horario.html");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
    }
}
