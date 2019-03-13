package Patient;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Patient patient2 = new Patient(2,23,"AB+");
        System.out.println("Patient number"+patient.getID()+" age:"+patient.getAge()+
                " with blood type:"+patient.getBloodData());
        System.out.println("Patient number"+patient2.getID()+" age:"+patient2.getAge()+
                " with blood type:"+patient2.getBloodData());
    }


}
