/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iit
 */
public class Serialize_IO {
    private static String filename = "serialize_data.txt";
    
    public void writeSerializeObject(){
        Account ac1 = new Account("Sezan", "12345", 600, "fr4567");
        
        FileOutputStream fout = null;
        ObjectOutputStream object_out_for_serializable = null;
        try {
            fout = new FileOutputStream(filename);
            object_out_for_serializable = new ObjectOutputStream(fout);
            
            object_out_for_serializable.writeObject(ac1);
            object_out_for_serializable.flush();
            
            System.out.println("Success to write serializable");
                    
        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        } 
        
    }
    
    public void writeSerializeListObject(ArrayList<Account> accounts){
        /*Account ac1 = new Account("Sezan", "12345", 600, "fr4567");
        Account ac2 = new Account("Kavi", "12336", 2600, "frdf567");
        
        ArrayList<Account> accountList = new ArrayList<>();
        
        accountList.add(ac1);
        accountList.add(ac2);*/
        
        FileOutputStream fout = null;
        ObjectOutputStream object_out_for_serializable = null;
        try {
            fout = new FileOutputStream(filename);
            object_out_for_serializable = new ObjectOutputStream(fout);
            
            object_out_for_serializable.writeObject(accounts);
            object_out_for_serializable.flush();
            
            System.out.println("Success to write serializable");
                    
        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        } 
        
    }
    
    
    public void readDeserializeObject(){
 
        try {
            ObjectInputStream object_in_for_deserializable =
                    new ObjectInputStream(new FileInputStream(filename));
            
            
            Account ac1 = (Account) object_in_for_deserializable.readObject();
            
            System.out.println(ac1);
            
        } catch (IOException ex) {
            System.out.println("IO Exception" + ex.getMessage());
//            Logger.getLogger(Serialize_IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serialize_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void readDeserializeListObject(){
 
        try {
            ObjectInputStream object_in_for_deserializable =
                    new ObjectInputStream(new FileInputStream(filename));
            
            ArrayList<Account> listOfAccounts =
                    (ArrayList<Account>) object_in_for_deserializable.readObject();
            
            for (Account deserializeStudent : listOfAccounts){
                System.out.println(deserializeStudent);
            }
//            Student student1 = (Student) object_in_for_deserializable.readObject();
//            
//            System.out.println(student1.name + "; All:" + student1.toString());
            
        } catch (IOException ex) {
            Logger.getLogger(Serialize_IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serialize_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
