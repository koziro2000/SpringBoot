package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by jroh on 12/09/2016.
 */
@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "Comp Sci"));
                put(2, new Student(2, "Alex", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        s.getExtraInfo().putAll(student.getExtraInfo());
        /*
        Iterator it = student.getExtraInfo().entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            s.getExtraInfo().put(pair.getKey().toString(), pair.getValue().toString());
        }*/

        students.put(student.getId(), s);
    }

    @Override
    public void insertStudent(Student student) {
        if (student.getId() <= 0) {
            student.setId(students.size() + 1);
        }
        students.put(student.getId(), student);
    }
}
