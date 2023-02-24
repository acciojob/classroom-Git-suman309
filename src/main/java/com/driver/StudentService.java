package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public void addStudent(Student student) {
        sr.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        sr.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        sr.addStudentTeacher(student,teacher);
    }

    public Student getStudentByName(String name) {
        return sr.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name) {
        return sr.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        return sr.getStudentsByTeacherName(teacher);
    }

    public List<String> getAllStudents() {
        return sr.getAllStudents();
    }

    public void deleteTeacherByName(String teacher) {
        sr.deleteTeacherByName(teacher);
    }

    public void deleteAllTeachers() {
        sr.deleteAllTeachers();
    }
}
