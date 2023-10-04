
/*SERVER CLASS*/
import java.net.*;
import java.io.*;

public class server {
    public static void main(String args[]) throws IOException {
        byte b[] = new byte[66000];
        DatagramSocket dsoc = new DatagramSocket(20000);
        FileOutputStream f = new FileOutputStream("essai.txt", true);
        while (true) {
            DatagramPacket dp = new DatagramPacket(b, b.length);
            dsoc.receive(dp);

            String fileInfo = "Fichier recu de la part de " + dp.getAddress() + ": " + dp.getLength() + " octets";
            System.out.println(fileInfo);

            f.write(b, 0, dp.getLength());
            System.out.println(dp.getLength());
        }
    }
}
