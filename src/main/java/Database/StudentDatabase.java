package Database;

import Repository.StudentRepository;
import com.example.studentmanagementsystem.Professor;
import com.example.studentmanagementsystem.Student;
import com.example.studentmanagementsystem.Subject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StudentDatabase implements StudentRepository{

    ArrayList<Student> studentDatabase = new ArrayList<Student>();

    public void generateDataInDatabase(){

        Professor prof1 = new Professor("Marko",
                "Marić",
                LocalDate.of(1994, 5, 4),
                UUID.randomUUID(),
                UUID.randomUUID());

        Professor prof2 = new Professor("Toni",
                "Milun",
                LocalDate.of(1992, 4, 2),
                UUID.randomUUID(),
                UUID.randomUUID());

        Professor prof3 = new Professor("Marko",
                "Remin",
                LocalDate.of(1991, 2, 8),
                UUID.randomUUID(),
                UUID.randomUUID());

        Subject sub1 = new Subject(prof1,3,"Uvod u umjetnu inteligenciju");
        Subject sub2 = new Subject(prof2,3,"Osnove programskog jezika Java");
        Subject sub3 = new Subject(prof3,4,"Programiranje mobilnih aplikacija");
        Subject sub4 = new Subject(prof1,2,"Uvod u umjetnu inteligenciju");
        Subject sub5 = new Subject(prof2,2,"Osnove programskog jezika Java");
        Subject sub6 = new Subject(prof3,2,"Programiranje mobilnih aplikacija");

        Student stud1 = new Student("Ivan",
                "Zelina",
                LocalDate.of(1991, 2, 8),
                UUID.randomUUID(),
                UUID.randomUUID(),
                new ArrayList<Subject>(List.of(sub1,sub2,sub3)));

        Student stud3 = new Student("Ana",
                "Perković",
                LocalDate.of(1993, 5, 7),
                UUID.randomUUID(),
                UUID.randomUUID(),
                new ArrayList<Subject>(List.of(sub4,sub5,sub6)));

        Student stud2 = new Student("Tina",
                "Perković",
                LocalDate.of(1993, 5, 7),
                UUID.randomUUID(),
                UUID.randomUUID(),
                new ArrayList<Subject>(List.of(sub2,sub5,sub1)));

        studentDatabase.add(stud1);
        studentDatabase.add(stud3);
        studentDatabase.add(stud1);
    }

    @Override
    public Student findStudentById(UUID studentID) {
        Student s = null;
        for (Student student : studentDatabase){
            if (student.getStudentId().equals(studentID)) {
                s = student;
            }
            else {
                System.out.println(" nema tog studenta u bazi");
            }
        }
        return s;
    }

    @Override
    public Student findStudentsByName(String studentName) {
            Student returnedStudent = null;
        for (Student student : studentDatabase){
            if(student.getName().equals(studentName)){
               returnedStudent=student;

            }
        }
        return returnedStudent;
    }


}
