package classobjectver2;

public class Student {
    String name;
    double grade1,grade2,grade3;
    Student(String name, double grade1, double grade2, double grade3){
        this.name=name;
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }void getName(){
        System.out.println("NAME: " + name); 
    } double getAverage(double grade1, double grade2, double grade3){
        double sum = grade1 + grade2 + grade3;
        double average = sum /3;
        return average;
    }  String getRemarks(double average){
        if(average >= 75){
            return " PASSED ";
        }else{
            return " FAILED ";
        }
    }
}
