package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private String batch;

    public Student(String name, int age, String group, String batch) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if (age < 16) {
            throw new InvalidAgeException();
        } else {
            this.age = age;
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "\nage=" + age +
                "\ngroup='" + group + '\'' +
                "\nbatch='" + batch + '\'' +
                '}';
    }
}
