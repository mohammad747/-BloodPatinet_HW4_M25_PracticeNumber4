package Blood;

public class BloodData {
    private String bloodType;
    private String rhFactor;

    BloodData(){
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String setBloodType(String bloodType) {
        this.bloodType = bloodType;
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }
}
