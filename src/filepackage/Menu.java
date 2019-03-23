package filepackage;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import personPackage.AcademicInfo;
import personPackage.PersonalInfo;
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

        for(int i=0;i<6;i++)
        {
            System.out.println(strings[i]);
        }

    }
}
