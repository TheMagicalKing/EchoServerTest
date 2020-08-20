package BMICalculateServer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientFunctions {

    static int port = 8193;
    static String host = "localhost";
    static DataInputStream in;
    static DataOutputStream out;
    static Socket socket;
    @FXML
    private TextField inputWeight, inputHeight;

    public void clientConnect() throws IOException{

        System.out.println("Client startet");
        socket = new Socket(host, port);

    }


    public void clientSend(ActionEvent actionEvent) throws IOException {
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        boolean serverMsg = true;
        out.writeUTF(inputWeight.getText());
        out.flush();
        out.writeUTF(inputHeight.getText());

    }
}
