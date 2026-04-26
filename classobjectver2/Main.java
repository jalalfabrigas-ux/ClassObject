package classobjectver2;

public class Main {
    public static void main(String args[]){
        Student name = new Student("JALAL");
        Student grade1 = new Student (87.5);
        Student grade2 = new Student (97.5);
        Student grade3 = new Student (90.5);
        

        name.getName();
        System.out.println("Average: " + Student.getAverage(grade1,grade2,grade3));
        System.out.println("Average: " + Student.getRemarks(gaverage));
        


    
    }
}
