package Blood;

/*
practice number 4
 */
/*
Written by: Mohammad Hashemi
Wednesday,March 13 2019
چهارشنبه،22اسفند97
 */
public class BloodData {
    private String bloodType;
    private String rhFactor;

    //default constructor
    BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    //overloaded constructor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String setBloodType(String bloodType) {
        this.bloodType = bloodType;
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

}//End of class
