package personPackage;

public class AcademicInfo
{
    String reg;
    String session;
    int sem;
    int year;
    float cgpa;
    String classRoll;

    public AcademicInfo(String reg, String session, int sem, int year, float cgpa, String classRoll)
    {
        this.reg = reg;
        this.session = session;
        this.sem = sem;
        this.year = year;
        this.cgpa = cgpa;
        this.classRoll = classRoll;
    }

    public AcademicInfo(String academic)
    {
        String [] arrayOfInfo = new String[6];
        int i = 0;
        String temp = "";

        for(int j=0;j<academic.length();j++)
        {
            if(i==6) break;

            if(academic.charAt(j)==',' || academic.charAt(j)==';')
            {
                arrayOfInfo[i] = temp;
                i++;
                temp = "";
            }

            else temp+=academic.charAt(j);
        }

        this.reg = arrayOfInfo[0];
        this.session = arrayOfInfo[1];
        this.sem = Integer.parseInt(arrayOfInfo[2]);
        this.year = Integer.parseInt(arrayOfInfo[3]);
        this.cgpa = Float.parseFloat(arrayOfInfo[4]);
        this.classRoll = arrayOfInfo[5];
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getClassRoll() {
        return classRoll;
    }

    public void setClassRoll(String classRoll) {
        this.classRoll = classRoll;
    }

    @Override
    public String toString() {
        return "AcademicInfo{" +
                "reg='" + reg + '\'' +
                ", session='" + session + '\'' +
                ", sem=" + sem +
                ", year=" + year +
                ", cgpa=" + cgpa +
                ", classRoll='" + classRoll + '\'' +
                '}';
    }
}
