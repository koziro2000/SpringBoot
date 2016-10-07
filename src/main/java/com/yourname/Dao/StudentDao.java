package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.Collection;

/**
 * Created by jroh on 12/09/2016.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
