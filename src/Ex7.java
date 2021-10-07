import java.io.*;

public class Ex7 {
    public void escritor() throws IOException {
        Utils utils = new Utils();
        String path = "C:\\Prueba\\textFile.txt";
        File file = new File(path);


        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linea;
        String ficheroModificado = "";
        while ((linea = reader.readLine()) != null) {

            ficheroModificado += linea + "\n";
        }
        reader.close();

        FileWriter fileWriter = new FileWriter(file);
        System.out.println("texto a añadir");

        ficheroModificado += utils.scanner.nextLine();

        fileWriter.write(ficheroModificado);
        fileWriter.close();
        utils.separador();
        System.out.println(ficheroModificado);
    }
}
