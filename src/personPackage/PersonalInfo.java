package personPackage;

import java.util.Date;

public class PersonalInfo
{
    private String name;
    private String fName;
    private String mName;
    private String dob;
    private String nid;
    private String address;
    private String reg;

    public PersonalInfo(String personal)
    {
        String [] arrayOfInfo = new String[7];

        int i = 0;
        String temp = "";

        for(int j=0;j<personal.length();j++)
        {
            if(i==8) break;

            if(personal.charAt(j)==',' || personal.charAt(j)==';')
            {
                arrayOfInfo[i] = temp;
                i++;
                temp = "";
            }

            else temp+=personal.charAt(j);
        }

        name = arrayOfInfo[0];
        fName = arrayOfInfo[1];
        mName = arrayOfInfo[2];
        dob = arrayOfInfo[3];
        nid = arrayOfInfo[4];
        address = arrayOfInfo[5];
        reg = arrayOfInfo[6];

    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", dob='" + dob + '\'' +
                ", nid='" + nid + '\'' +
                ", address='" + address + '\'' +
                ", reg='" + reg + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getDob() {
        return dob;
    }

    public String getNid() {
        return nid;
    }

    public String getAddress() {
        return address;
    }

    public String getReg() {
        return reg;
    }
}
