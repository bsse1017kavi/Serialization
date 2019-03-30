package serializePackage;

import java.util.ArrayList;

public class Bank
{
    ArrayList<Account> accounts = new ArrayList<>();

    Account ac1 = new Account("Sezan", "12345", 600, "fr4567");
    Account ac2 = new Account("Kavi", "12336", 2600, "frdf567");

    public Bank()
    {
        accounts.add(ac1);
        accounts.add(ac2);
    }

    public void update()
    {
        Serialize_IO serial_io = new Serialize_IO();
        serial_io.writeSerializeListObject(accounts);
        serial_io.readDeserializeListObject();
    }
}
