package EchoServerTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

    static int port = 8192;

    static DataInputStream in;
    static DataOutputStream out;
    static ServerSocket server;
    static Socket socket;


    public static void main(String[] args) {

        try{
            System.out.println("Server startet");
            server = new ServerSocket(port);
            socket = server.accept();
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            boolean goodbye = false;
          while (true) {
              String hej = in.readUTF();
              System.out.println(hej);
              out.writeUTF(hej);

          }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


