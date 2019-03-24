package filepackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import personPackage.AcademicInfo;
import personPackage.PersonalInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/scene1.fxml"));

        Parent root2b = loader.load();

        Scene scene2b = new Scene(root2b);

        primaryStage.setScene(scene2b);

        primaryStage.show();

    }

    public static void main(String [] args) throws IOException
    {
        launch(args);
        //Menu menu = new Menu();

       /* menu.search("2017114120");
        menu.search("2017115175");*/

        /*Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to do?\n1.Search\n2.Insert");

        int choice = sc.nextInt();

        if(choice==1)
        {
            System.out.println("Give registration number:");
            String reg = sc.nextLine();
            reg = sc.nextLine();

            menu.search(reg);
        }

        else if(choice==2)
        {
            System.out.println("What do you want to insert?\n1.Academic Info\n2.Personal Info");
            int choice2 = sc.nextInt();

            if(choice2==1)
            {
                launch(args);
            }

            if(choice2==2)
            {
                Menu menu1 = new Menu();
                ActionEvent event = new ActionEvent();

                menu1.changeToScene2a(event);
            }
        }*/
    }
}
