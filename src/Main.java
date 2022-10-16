import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask how many Students to add
        System.out.print("Number of students to add: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create the Students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            System.out.println("-----------------------------");
            students[i].enroll();
            System.out.println("-----------------------------");
            students[i].payTuition();
            System.out.println("-----------------------------");
            students[i].showInfo();
            System.out.println("-----------------------------");
        }
    }
}