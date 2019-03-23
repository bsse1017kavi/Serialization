package filepackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import personPackage.AcademicInfo;
import personPackage.PersonalInfo;

import java.util.ArrayList;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/scene2b.fxml"));

        Parent root2b = loader.load();

        Scene scene2b = new Scene(root2b);

        primaryStage.setScene(scene2b);

        primaryStage.show();

    }

    public static void main(String [] args)
    {
        launch(args);
        Menu menu = new Menu();

        menu.search("2017114120");
    }
}
