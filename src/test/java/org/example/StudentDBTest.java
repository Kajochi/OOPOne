package org.example;

import model.Students;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

   /* @Test
    void studentequalsTrue(){
        Students studentone = new Students(001, "Klaus");
        Students studenttwo = new Students(002, "Hans");
        Students studentthree = new Students(003, "Elfriede");
        Students studentffour = new Students(004, "Paula");
        Students studentfive = new Students(005, "Gerda");
        Students studentsix = new Students(006, "Tom");


        Students [] students = {studentone, studenttwo, studentthree, studentffour, studentfive, studentsix};

        StudentDB studentDB = new StudentDB(students);

    }*/

    @Test

    void IfNoStudentWithIdExistThrowException() {
        //Given
        StudentDB studentDB = new StudentDB();
        //When
        //Then
        assertThrows(CouldNotFindStudentException.class, ()->   studentDB.findById(10));
    }
}