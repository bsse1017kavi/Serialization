package filepackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import personPackage.AcademicInfo;
import personPackage.PersonalInfo;

import java.io.IOException;
import java.util.ArrayList;

public class Menu
{
    private ArrayList<AcademicInfo> academicInfos;
    private ArrayList<PersonalInfo> personalInfos;

    @FXML TextField tfb1;
    @FXML TextField tfb2;
    @FXML TextField tfb3;
    @FXML TextField tfb4;
    @FXML TextField tfb5;
    @FXML TextField tfb6;

    @FXML TextField tfa1;
    @FXML TextField tfa2;
    @FXML TextField tfa3;
    @FXML TextField tfa4;
    @FXML TextField tfa5;
    @FXML TextField tfa6;
    @FXML TextField tfa7;


    public Menu()
    {
        Test_File test_file = new Test_File();
        academicInfos = test_file.readFromFile_BufferReader_academic_info();
        personalInfos = test_file.readFromFile_BufferReader_personal_info();
    }

    public void search(String reg)
    {
        for(int i=0;i<academicInfos.size();i++)
        {
            for(int j=0;j<personalInfos.size();j++)
            {
                if(academicInfos.get(i).getReg().equals(reg) && personalInfos.get(j).getReg().equals(reg))
                {
                    System.out.println(academicInfos.get(i));
                    System.out.println(personalInfos.get(j));
                    return;
                }
            }
        }

        System.out.println("No such entry");
    }

    @FXML
    public void insert_academic()
    {
        String [] strings = new String[6];

        if(tfb1.getText()!=null)strings[0] = tfb1.getText();
        if(tfb2.getText()!=null)strings[1] = tfb2.getText();
        if(tfb3.getText()!=null)strings[2] = tfb3.getText();
        if(tfb4.getText()!=null)strings[3] = tfb4.getText();
        if(tfb5.getText()!=null)strings[4] = tfb5.getText();
        if(tfb6.getText()!=null)strings[5] = tfb6.getText();

        /*for(int i=0;i<6;i++)
        {
            System.out.println(strings[i]);
        }*/

        String result = tfb1.getText() + "," + tfb2.getText() + "," +tfb3.getText() + ","+tfb4.getText() + ","+
                tfb5.getText() + ","+tfb6.getText() + ";";

        Test_File test_file = new Test_File();

        test_file.writeToFile_BufferWriter_academic(result);

    }

    @FXML
    public void insert_personal()
    {
        String [] strings = new String[7];

        if(tfa1.getText()!=null)strings[0] = tfa1.getText();
        if(tfa2.getText()!=null)strings[1] = tfa2.getText();
        if(tfa3.getText()!=null)strings[2] = tfa3.getText();
        if(tfa4.getText()!=null)strings[3] = tfa4.getText();
        if(tfa5.getText()!=null)strings[4] = tfa5.getText();
        if(tfa6.getText()!=null)strings[5] = tfa6.getText();
        if(tfa7.getText()!=null)strings[5] = tfa7.getText();

        /*for(int i=0;i<6;i++)
        {
            System.out.println(strings[i]);
        }*/

        String result = tfa1.getText() + "," + tfa2.getText() + "," +tfa3.getText() + ","+tfa4.getText() + ","+
                tfa5.getText() + ","+tfa6.getText() + ","+tfa7.getText() + ";";

        Test_File test_file = new Test_File();

        test_file.writeToFile_BufferWriter_personal(result);

    }

    public void changeToScene2a(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/scene2a.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
