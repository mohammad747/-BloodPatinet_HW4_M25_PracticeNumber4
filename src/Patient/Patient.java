package Patient;

import Blood.BloodData;

public class Patient {
    private int ID;
    private int age;
    private String bloodData;
    private BloodData bloodDataObject = new BloodData();

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBloodData(String bloodData) {
        this.bloodData = bloodData;
    }

    public String getBloodData() {
        return bloodData;
    }

    public Patient(){
        this.ID = 0;
        this.age = 0;
        this.bloodData = bloodDataObject.getBloodType()+bloodDataObject.getRhFactor();
    }

    public Patient(int ID, int age, String bloodData){
        this.ID = ID;
        this.age = age;
        this.bloodData = bloodDataObject.getBloodType()+bloodDataObject.getRhFactor();
    }


}
