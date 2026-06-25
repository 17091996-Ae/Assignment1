import javax.sound.midi.SysexMessage;

public class Assignment1 {
    static void main() {
        //School-related variables
        String StudentName ="Asante Emmanuel";
        String CourseName ="Computer Networking";
        int Level = 200;
        double GPA = 3.92;
        boolean IsRegistered = true;
        char GradeCode ='B';
        long StudentID = 20242372L;

        //Displaying the school information
        System.out.println("--- Student Profile---");
        System.out.println("Name:" + StudentName);
        System.out.println("Course" + CourseName);
        System.out.println("Level" + Level);
        System.out.println("GPA" + GPA);
        System.out.println("Registered" + IsRegistered);
        System.out.println("Current Grade" + GradeCode);
        System.out.println("Student ID" + StudentID);
    }
}
