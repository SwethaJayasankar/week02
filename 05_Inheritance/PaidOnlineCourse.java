class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourse() {
        return this.courseName;
    }

    public int getDuration() {
        return this.duration;
    }
}

class OnlineCourse extends Course {
    private String platform ;
    private boolean recorded;

    public OnlineCourse(String courseName,int duration, String platform,boolean recorded){
        super(courseName, duration);
        this.platform = platform;
        this.recorded = recorded ;
    }
    public String getPlatform(){
        return this.platform;
    }
    public String isRecorded(){
        if(this.recorded){
            return "The course is been recorded !  ";
        }
        return "The course is not been recorded !  ";
    }
}

public class PaidOnlineCourse extends OnlineCourse{

    public double fee;
    public double discount;

    public PaidOnlineCourse(String courseName,int duration,String platform,boolean rec,double fee,double discount){
        super(courseName, duration, platform,rec);
        this.fee = fee;
        this.discount = discount;
    }
    public void displayInfo(){
        System.out.println("Course name is "+ super.getCourse() + " and the course duration is for "+ super.getDuration()+ " years and its live online on platform "+ super.getPlatform() + ". Is it recorded ? "+ super.isRecorded() + "Course fee is "+ this.fee + " and avail a discount of "+this.discount + " percentage .");
    }
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java ", 1, "google classroom", false, 20000, 15);
        p.displayInfo();


    }

}
