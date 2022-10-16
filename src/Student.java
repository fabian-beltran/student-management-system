import java.text.DecimalFormat;
import java.util.Scanner;

public class Student {
    private static int initId = 100;
    private String id;
    private String firstName;
    private String lastName;
    private int graduationYear;
    private String courses = "";
    private double tuitionBalance = 0;
    private static double courseCost = 600;
    private static DecimalFormat dec = new DecimalFormat("#0.00");

    // Constructor: Prompt to enter student information
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student's graduation year: ");
        this.graduationYear = in.nextInt();

        generateId();

        System.out.println(firstName + " " + lastName + " " + graduationYear + " " + id);
    }

    // Generate ID
    private void generateId() {
        initId++;
        this.id = graduationYear % 100 + "" + initId;
    }

    // Enroll in courses
    public void enroll() {
        System.out.println("Enter courses to enroll (F to finish)");

        do {
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("F")) {
                courses = courses + "\n   " + course;
                tuitionBalance += courseCost;
            } else { break; }
        } while (true);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("-----------------------------");
        System.out.println("TUITION BALANCE: $" + dec.format(tuitionBalance));
    }

    // View balance
    public void viewBalance() {
        System.out.println("CURRENT BALANCE: $" + dec.format(tuitionBalance));
    }

    // Pay tuition
    public void payTuition() {
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + dec.format(payment));
        viewBalance();
    }

    // Show status
    public void showInfo() {
        System.out.println("Student ID: " + id + "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Graduation Year: " + graduationYear + "\n" + "Courses Enrolled: " + courses + "\n" + "Tuition Balance: $" + dec.format(tuitionBalance));
    }

}
