package com.company;

public class Main {

    public static void main(String[] args) throws InvalidAgeException {
        Student student1 = new Student("Chynara", 33, "Java", "5");
        Student student2 = new Student("Kunzaada", 24, "Java", "5");
        Student student3 = new Student("Aziza", 30, "Java", "5");
        Student student4 = new Student("Klara", 30, "Java", "5");
        Student student5 = new Student("Dinara", 18, "Java", "5");
        Student student6 = new Student("Nargiza", -8, "Java", "5");
        student6.setAge(8);
        Student[] students = {student1, student2, student3, student4, student5, student6};


        Course course = new Course("Java", "Grajdanskaya 119", students );
        System.out.println(course);
    }
}
