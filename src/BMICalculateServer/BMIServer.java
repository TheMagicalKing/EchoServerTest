package BMICalculateServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BMIServer {

    static int port = 8193;

    static DataInputStream in;
    static DataOutputStream out;
    static ServerSocket server;
    static Socket socket;public static void main(String[] args) {

        try{
            System.out.println("Server startet");
            server = new ServerSocket(port);
            socket = server.accept();
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            int bmiWeight = Integer.parseInt(in.readUTF());
            int bmiHeight = Integer.parseInt(in.readUTF());
            int bmiCalculate = bmiHeight + bmiWeight;
            System.out.println(bmiCalculate);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
