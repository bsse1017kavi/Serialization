/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializePackage;

/**
 *
 * @author iit
 */
public class MainSerializable {

    public static void main(String[] args) {
       // Serialize_IO serial_io = new Serialize_IO();
       //serial_io.writeSerializeObject();
       //serial_io.readDeserializeObject();

        //serial_io.writeSerializeListObject();
        //serial_io.readDeserializeListObject();

        Bank bank = new Bank();
        bank.update();
    }
    
    
    
}
