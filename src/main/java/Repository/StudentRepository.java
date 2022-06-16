package Repository;

import com.example.studentmanagementsystem.Student;

import java.util.ArrayList;
import java.util.UUID;

public interface StudentRepository {

    Student findStudentById(UUID studentID);
    ArrayList<Student>findStudentsByName(String name);
}
