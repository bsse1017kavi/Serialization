package filepackage;

import personPackage.AcademicInfo;
import personPackage.PersonalInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Test_File {

    private String FILENAME = "academic.txt";

    public void  writeToFile_BufferWriter() {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = JOptionPane.showInputDialog("Write about BSSE08");

            //open filewriter as write mode
            fw = new FileWriter(FILENAME);

            //open filewriter as append mode
//			fw = new FileWriter(FILENAME, true);


            bw = new BufferedWriter(fw);
            bw.flush();

            bw.write(content);

            System.out.println("Write Done" + content);

            if (bw != null)
                bw.close();

            if (fw != null)
                fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<AcademicInfo> readFromFile_BufferReader_academic_info() {

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            ArrayList<String> listOfInfo = new ArrayList<>();

            String sCurrentLine;
            int ch;

            ArrayList<AcademicInfo> academicInfoArrayList = new ArrayList<>();

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                /*if((char)ch == ',')
                {
                    System.out.println();
                    ch = br.read();
                    if((char)ch == ' ') ;
                    else System.out.println((char)ch);
                }
                
                else System.out.print((char)ch);*/

                listOfInfo.add(sCurrentLine);
            }

            for(String temp: listOfInfo)
            {
                AcademicInfo academicInfo = new AcademicInfo(temp);
                academicInfoArrayList.add(academicInfo);
            }

            /*for(AcademicInfo temp: academicInfoArrayList)
            {
                System.out.println(temp);
            }*/

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

            return academicInfoArrayList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<PersonalInfo> readFromFile_BufferReader_personal_info() {

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader("personal.txt");
            br = new BufferedReader(fr);

            ArrayList<String> listOfInfo = new ArrayList<>();

            String sCurrentLine;
            int ch;

            ArrayList<PersonalInfo> personalInfoArrayList = new ArrayList<>();

            br = new BufferedReader(new FileReader("personal.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                listOfInfo.add(sCurrentLine);
            }

            for(String temp: listOfInfo)
            {
                PersonalInfo personalInfo = new PersonalInfo(temp);
                personalInfoArrayList.add(personalInfo);
            }

            /*for(AcademicInfo temp: academicInfoArrayList)
            {
                System.out.println(temp);
            }*/

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

            return personalInfoArrayList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void listOfDirectory() {
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("download");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }

}

