import java.util.Scanner;

class Student {
    private int roll;
    private String name;
    private double cgpa;

    
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        
        Student[] students = new Student[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            
            students[i] = new Student(roll, name, cgpa);
        }

        
        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.getRoll());
            System.out.println("Name: " + student.getName());
            System.out.println("CGPA: " + student.getCgpa());
            System.out.println();
        }

        // Find the student with the lowest CGPA
        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaName = "";

        for (Student student : students) {
            if (student.getCgpa() < lowestCgpa) {
                lowestCgpa = student.getCgpa();
                lowestCgpaName = student.getName();
            }
        }

        
        System.out.println("Student with the lowest CGPA: " + lowestCgpaName);

        scanner.close();
    }
}
