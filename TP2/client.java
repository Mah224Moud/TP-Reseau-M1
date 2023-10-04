
/*CLIENT CLASS*/
import java.net.*;
import java.io.*;

public class client {
    public static void main(String args[]) throws Exception {
        byte b[] = new byte[135000];
        FileInputStream f = new FileInputStream("test.txt");
        DatagramSocket dsoc = new DatagramSocket(2000);
        int i = 0;
        while (f.available() != 0) {
            b[i] = (byte) f.read();
            i++;
        }
        f.close();
        dsoc.send(new DatagramPacket(b, i, InetAddress.getByName("172.31.18.50"), 20000));
    }

}
