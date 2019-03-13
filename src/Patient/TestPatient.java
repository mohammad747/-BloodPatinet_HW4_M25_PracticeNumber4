package Patient;
/*
practice number 4
 */
/*
Written by: Mohammad Hashemi
Wednesday,March 13 2019
چهارشنبه،22اسفند97
 */
public class TestPatient {
    public static void main(String[] args) {
        //Create an object with default constructor
        Patient patient = new Patient();
        //Create another object with overloaded constructor
        Patient patient2 = new Patient(2, 23, "AB+");
        //Testing
        System.out.println("Patient number" + patient.getID() + " age:" + patient.getAge() +
                " with blood type:" + patient.getBloodData());
        System.out.println("Patient number" + patient2.getID() + " age:" + patient2.getAge() +
                " with blood type:" + patient2.getBloodData());
    }//End of main

}//End of class
