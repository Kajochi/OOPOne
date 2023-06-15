package org.example;


import model.Students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Students studentone = new Students(001, "Klaus");
        Students studenttwo = new Students(002, "Hans");
        Students studentthree = new Students(003, "Elfriede");
        Students studentffour = new Students(004, "Paula");
        Students studentfive = new Students(005, "Gerda");
        Students studentsix = new Students(006, "Tom");
        Students studentseven = new Students(007, "Ida");


        StudentDB studentDB = new StudentDB();

        studentDB.addStudent(studentone);
        studentDB.addStudent(studenttwo);
        studentDB.addStudent(studentthree);
        studentDB.addStudent(studentffour);
        studentDB.addStudent(studentfive);
        studentDB.addStudent(studentsix);
        studentDB.addStudent(studentseven);

/*
        System.out.println(studentDB);
        Students studenteight = new Students(8, "Franz");
        studentDB.addStudent(studenteight);
        //System.out.println(students);
       // studentDB.removeStudent("Paula");

        System.out.println(studentDB);

        studentDB.removeStudent(studentffour);

        System.out.println(studentDB);
*/      try {
            System.out.println(studentDB.findById(34));
        }catch (CouldNotFindStudentException o){
            System.out.println("Kein Student mit dieser Id vorhanden!");
        }


    }
}