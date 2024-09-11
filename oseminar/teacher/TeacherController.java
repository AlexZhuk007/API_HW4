package ru.gb.oseminar.teacher;

import ru.gb.oseminar.controller.UserController;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.teacher.TeacherService;
import ru.gb.oseminar.teacher.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void editTeacher(Long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        // реализовать логику редактирования учителя
    }

    public void getTeacher(Long teacherId) {
        // реализовать логику получения информации о конкретном учителе
    }

    public void getAllTeachers() {
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
