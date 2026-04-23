public class Name {
    String name,hobby;
    int age;
    
    Name(String name,int age, String hobby){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    }
    void displayInfo(){
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Hobby: " + hobby);
    }
}   


