package Blood;

/*
practice number 4
 */
/*
Written by: Mohammad Hashemi
Wednesday,March 13 2019
چهارشنبه،22اسفند97
 */
public class TestBloodData {
    public static void main(String[] args) {
        //Create an object with default constructor
        BloodData bloodData = new BloodData();
        //Create another object with overloaded constructor
        BloodData bloodData2 = new BloodData("A", "+");
        //Testing
        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor());
        System.out.println(bloodData2.getBloodType() + bloodData2.getRhFactor());
        bloodData.setBloodType("AB");
        bloodData.setRhFactor("-");
        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor());
    }//End of main

}//End of class
