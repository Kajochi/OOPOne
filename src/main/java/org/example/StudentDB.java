package org.example;

import model.Students;

import java.util.Arrays;

public class StudentDB {
    private Students [] studentDB;


    public StudentDB(){
        this.studentDB = studentDB;
    }
    public StudentDB(Students[] studentDB) {
        this.studentDB = studentDB;
    }

    public Students[] getStudentDB() {
        return studentDB;
    }

    public void setStudentDB(Students[] studentDB) {
        this.studentDB = studentDB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB1 = (StudentDB) o;
        return Arrays.equals(getStudentDB(), studentDB1.getStudentDB());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStudentDB());
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + Arrays.toString(studentDB) +
                '}';
    }

    public Students randomStudent(){
        int min = 0;
        int max = (this.studentDB.length-1);
        int randomNum = (int)(Math.random()*((max-min)+1))+min;
        return this.studentDB[randomNum];
    }

    public void addStudent(Students student){

        Students[] newArray;
        newArray   = Arrays.copyOf(this.studentDB, (this.studentDB.length+1));
        newArray[this.studentDB.length] = student;

        this.studentDB = newArray;

    }

    public void removeStudent(String name){
        int position =0;
        Students [] newArray = new Students[this.studentDB.length];
        for (int i = 0; i< this.studentDB.length; i++ ) {
            Students element = this.studentDB[i];
            if (element.getName().equals(name)) {
                position = i;
            }

        }

       System.arraycopy(this.studentDB, 0, newArray, 0, position);
        if (this.studentDB.length != position){
            System.arraycopy(this.studentDB, position+1,newArray,position, this.studentDB.length-position-1);
        }

        this.studentDB=newArray;

    }

}
