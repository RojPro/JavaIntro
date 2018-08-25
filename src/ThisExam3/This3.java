package ThisExam3;

// use this with method ;

public class This3 {
    public void sami(){
        System.out.println("your name is Sami");
    }
    public void sam(){
        this.sami();
    }
    public void lion(){
        // لانستعمل ال this لانه jvm هوا اتوماتيكا يثوم ياضافتها
        sami();
    }
}
