package org.example;


import model.Students;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Students studentone = new Students(001, "Klaus");
        Students studenttwo = new Students(002, "Hans");
        Students studentthree = new Students(003, "Elfriede");
        Students studentffour = new Students(004, "Paula");
        Students studentfive = new Students(005, "Gerda");
        Students studentsix = new Students(006, "Tom");
        Students studentseven = new Students(007, "Ida");

        Students [] students = {studentone, studenttwo, studentthree, studentffour, studentfive, studentsix};

        StudentDB studentDB = new StudentDB(students);

        studentDB.addStudent(studentseven);
       System.out.println(studentDB);

        Students studenteight = new Students(8, "Franz");
        //studentDB.addStudent(studenteight);
        //System.out.println(studentDB);
        studentDB.removeStudent("Paula");

        System.out.println(studentDB);




    }
}