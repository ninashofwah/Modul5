package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {

        Student[] students = {
            new Student("S001", "Alice", 20, 3.8),
            new Student("S002", "Bob", 22, 3.6),
            new Student("S003", "Charlie", 21, 3.9),
            new Student("S004", "John", 23, 3.7),
            new Student("S005", "Anne", 25, 4.0)  
        };

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() +
                               ", Nama: " + student.getName() +
                               ", Umur: " + student.getAge() +
                               ", GPA: " + student.getGpa());
        }
    }
}