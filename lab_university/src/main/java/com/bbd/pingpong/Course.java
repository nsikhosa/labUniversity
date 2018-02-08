package com.bbd.pingpong;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;
    private int capacity;
    private static int numberOfCourses;

    public Course (String name, int cap)
    {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.capacity = cap;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static int getNumberOfCourses() {
        return numberOfCourses;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void setNumberOfCourses(int numberOfCourses) {
        Course.numberOfCourses = numberOfCourses;
    }

    public boolean enrollStudent(Student s)
    {
        if (this.students.size() < this.capacity)
        {
            if (this.students.add(s)){
                return (true);
            }
            else
                return (false);
        }
        else
            return (false);
    }
    public boolean unenrollStudents(Student s)
    {
        if (this.students.remove(s))
            return (true);
        else
            return (false);
    }
}
