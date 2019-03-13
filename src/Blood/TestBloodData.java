package Blood;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        BloodData bloodData2 = new BloodData("A","+");
        System.out.println(bloodData.getBloodType()+bloodData.getRhFactor());
        System.out.println(bloodData2.getBloodType()+bloodData2.getRhFactor());
        bloodData.setBloodType("AB");
        bloodData.setRhFactor("-");
        System.out.println(bloodData.getBloodType()+bloodData.getRhFactor());
    }


}
