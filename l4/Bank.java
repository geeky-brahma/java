package l4;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance:");
        balance = scanner.nextDouble();
        // scanner.close();
    }
    
    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name, aadhar_no;
    
    // @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Bank {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name:");
            persons[i].name = scanner.nextLine();
            System.out.println("Enter Aadhar number:");
            persons[i].aadhar_no = scanner.nextLine();
            // scanner.close();
            persons[i].input();
        }
        System.out.println("The Details are: ");
        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }
    }
}
