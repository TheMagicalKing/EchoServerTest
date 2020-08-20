package BMICalculateServer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientUIMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ClientUI.fxml"));
        primaryStage.setTitle("BMI Test");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        ClientFunctions client = new ClientFunctions();
        client.clientConnect();
    }

}
