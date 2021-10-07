import java.io.*;

public class Ex8 {
    Utils utils = new Utils();

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

        System.out.println("texto a añadir");

        ficheroModificado += utils.scanner.nextLine();

        long timeMilliFw1 = System.currentTimeMillis();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(ficheroModificado);
        fileWriter.close();
        long timeMilliFw2 = System.currentTimeMillis();


        long timeMilliBw1 = System.currentTimeMillis();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(ficheroModificado);
        bufferedWriter.close();
        long timeMilliBw2 = System.currentTimeMillis();


        utils.separador();
        //System.out.println(ficheroModificado);
        System.out.println("tiempo de FileWriter " + (timeMilliFw2 - timeMilliFw1));
        System.out.println("tiempo de BufferedWriter " + (timeMilliBw2 - timeMilliBw1));

    }
}
