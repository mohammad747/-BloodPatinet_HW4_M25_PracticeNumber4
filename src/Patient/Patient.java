package Patient;

import Blood.BloodData;

public class Patient {
    private int ID;
    private int age;
    private String bloodData;
    private BloodData bloodDataObject = new BloodData("A", "+");

    public void setID(int ID) {
        this.ID = ID;
    }

    int getID() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void setBloodData(String bloodData) {
        this.bloodData = bloodData;
    }

    String getBloodData() {
        return bloodData;
    }

    Patient(){
        this.ID = 0;
        this.age = 0;
        this.bloodData = bloodDataObject.getBloodType()+bloodDataObject.getRhFactor();
    }

    Patient(int ID, int age, String bloodData){
        this.ID = ID;
        this.age = age;

        this.bloodData = bloodDataObject.setBloodType(bloodData);
    }


}
