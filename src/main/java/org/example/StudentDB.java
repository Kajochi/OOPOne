package org.example;

import model.Students;

import java.util.*;

public class StudentDB {
    private HashMap<String ,Students> studentDB;


    public StudentDB(){
        this.studentDB = new HashMap<>();
    }



    public HashMap<String ,Students> getStudentDB() {
        return studentDB;
    }

    public void setStudentDB(HashMap<String ,Students> studentDB) {
        this.studentDB = studentDB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB1 = (StudentDB) o;
        return Objects.equals(getStudentDB(), studentDB1.getStudentDB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentDB());
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + studentDB +
                '}';
    }

    public Students randomStudent(){
        int min = 0;
        int max = (this.studentDB.size()-1);
        int randomNum = (int)(Math.random()*((max-min)+1))+min;
        return this.studentDB.get(randomNum);
    }

    public void addStudent(Students student){

        this.studentDB.put(student.getName(), student);

    }

    public void removeStudent(Students student){
        this.studentDB.remove(student.getName());

    }

    public Students findById(int id) throws CouldNotFindStudentException {
       if (studentDB.containsKey(id)) {
           return studentDB.get(id);
       }
        throw new CouldNotFindStudentException();

    }

}
