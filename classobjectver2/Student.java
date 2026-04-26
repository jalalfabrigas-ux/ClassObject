package classobjectver2;

public class Student {
    String name;
    double grade1, grade2, grade3;


    public Student(String name, double g1, double g2, double g3) {
        this.name = name;
        this.grade1 = g1;
        this.grade2 = g2;
        this.grade3 = g3;
    }public double getAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }public String getRemarks() {
        if (getAverage() >= 75) {
            return "Passed";
        } else {
            return "Failed";
        }
    }public String getName() {
        return name;
    }
}