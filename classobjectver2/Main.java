package classobjectver2;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("JALAL", 87.5, 97.5, 90.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Remarks: " + student.getRemarks());
    }
}