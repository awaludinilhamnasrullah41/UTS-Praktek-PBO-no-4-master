package soal4;

public class Main {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Wat", "Zit Tooya", "61153");
       
       TextBook myTextBook = new TextBook("How To Be Human", "Matt", "Tune Core");
       
       Course myCourse = new Course("How To", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}