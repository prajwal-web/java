package StudentmanagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(int id, String name, int age, String course) {
        Student newStudent = new Student(id, name, age, course);
        studentList.add(newStudent);
        System.out.println("Successfully added: " + newStudent);
    }

    public void removeStudent(int id) {
        Student studentToRemove = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
            System.out.println("Student removed: " + studentToRemove);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void findStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void findStudentByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name.trim())) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student with name " + name + " not found.");
    }

    public void listAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            System.out.println("List of all students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void updateStudent(int id, String name, int age, String course) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                System.out.println("Updated student: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Find Student by Name");
            System.out.println("5. List All Students");
            System.out.println("6. Update Student");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Course: ");
                    String course = scanner.nextLine();
                    manager.addStudent(id, name, age, course);
                    break;
                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    manager.findStudentById(searchId);
                    break;
                case 4:
                    System.out.print("Enter Student Name to search: ");
                    String searchName = scanner.nextLine();
                    manager.findStudentByName(searchName);
                    break;
                case 5:
                    manager.listAllStudents();
                    break;
                case 6:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Student Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new Student Age: ");
                    int updateAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Student Course: ");
                    String updateCourse = scanner.nextLine();
                    manager.updateStudent(updateId, updateName, updateAge, updateCourse);
                    break;
                case 7:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
