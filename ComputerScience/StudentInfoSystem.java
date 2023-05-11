package ComputerScience;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter information for student #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Major: ");
            String major = scanner.nextLine();
            System.out.print("Enter the number of subject: ");
            int numSubject = scanner.nextInt();
            scanner.nextLine();
            Subject[] subjects = new Subject[numSubject];

            for (int j = 0; j < subjects.length; j++) {
                System.out.print("Enter the Subject " + (j + 1) + ": ");
                String subjectname = scanner.nextLine();
                System.out.print("Enter the Quiz score(between 0 and 10):");
                int subjectquiz = scanner.nextInt();
                scanner.nextLine();
                if (subjectquiz < 0 || subjectquiz > 10) {
                    while (true) {
                        System.out.print("Quiz must be between 0 and 10 Please Enter Again: ");
                        subjectquiz = scanner.nextInt();
                        scanner.nextLine();
                        if (subjectquiz >= 0 && subjectquiz <= 10) {
                            break;
                        }
                    }

                }
                System.out.print("Enter the Midterm Score(between 0 and 20):");
                int subjectmidterm = scanner.nextInt();
                scanner.nextLine();
                if (subjectmidterm < 0 || subjectmidterm > 20) {
                    while (true) {
                        System.out.print("Midterm Score must be between 0 and 20 Please Enter Again: ");
                        subjectmidterm = scanner.nextInt();
                        scanner.nextLine();
                        if (subjectmidterm >= 0 && subjectmidterm <= 20) {
                            break;
                        }
                    }

                }
                System.out.print("Enter the Project Score(between 0 and 20):");
                int subjectproject = scanner.nextInt();
                scanner.nextLine();
                if (subjectproject < 0 || subjectproject > 20) {
                    while (true) {
                        System.out.print("Project Score must be between 0 and 20 Please Enter Again: ");
                        subjectproject = scanner.nextInt();
                        scanner.nextLine();
                        if (subjectproject >= 0 && subjectproject <= 20) {
                            break;
                        }
                    }

                }
                System.out.print("Enter the Finalexam Score:");
                int subjectfinalexam = scanner.nextInt();
                scanner.nextLine();
                if (subjectfinalexam < 0 || subjectfinalexam > 50) {
                    while (true) {
                        System.out.print("Finalexam Score must be between 0 and 50 Please Enter Again: ");
                        subjectfinalexam = scanner.nextInt();
                        scanner.nextLine();
                        if (subjectfinalexam >= 0 && subjectfinalexam <= 50) {
                            break;
                        }
                    }
                }
                subjects[j] = new Subject(subjectname, subjectquiz, subjectmidterm, subjectproject, subjectfinalexam);
                if (subjects[j].getEntryPoint() < 51 || subjects[j].getFinalexam() < 23) {
                    System.out.println("Student is failed from " + subjects[j].getName());
                }
            }

            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Adress: ");
            String adress = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            students[i] = new Student(name, id, major, email, adress, phone);

        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nInformation for student #" + (i + 1));
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getId());
            System.out.println("Major: " + students[i].getMajor());
            System.out.println("E-mail: " + students[i].getEmail());
            System.out.println("Adress: " + students[i].getAddress());
            System.out.println("Phone: " + students[i].getPhone());
            
        }

        scanner.close();
    }
}