package org.example.homework13_13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudent;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudent++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
