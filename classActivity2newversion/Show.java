package classActivity2newversion;

public class Show {
    private String title;
    private int duration;
    public Show(String title, int duration){
        this.title=title;
        this.duration=duration;
    } public String title(){
        return title;
    } public int  getDuration(){
        return duration;
    } public void setTitle(String title){
        this.title=title;
    }  public void setDuration(int duration){
        this.duration=duration;
    } public void displayInfo(){
        System.out.println();
        System.out.print("\nTitle: " + title);
        System.out.print("\nDuration of Movie: " + duration + "minutes");
    }
}  
//title
//duration