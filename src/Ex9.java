import java.io.*;

public class Ex9 {
    public void prueba(String[] titols, int[] anyoPublicacion) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Prueba\\BinaryFile.dat"));
        for (int i = 0; i < titols.length; i++) {
            dataOutputStream.writeUTF(titols[i]);
        }
        for (int i = 0; i < anyoPublicacion.length; i++) {
            dataOutputStream.writeInt(anyoPublicacion[i]);
        }
        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Prueba\\BinaryFile.dat"));
        for (int i = 0; i < titols.length; i++) {
            System.out.println(dataInputStream.readUTF());
        }
        for (int i = 0; i < anyoPublicacion.length ; i++) {
            System.out.println(dataInputStream.readInt());
        }

        dataInputStream.close();
    }
}
