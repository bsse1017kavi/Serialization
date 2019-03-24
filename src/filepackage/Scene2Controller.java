package filepackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller
{
    @FXML
    public void scene_forward_academic(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/scene2b.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    public void scene_forward_personal(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/scene2a.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
