package ru.gb.oseminar.teacher;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.view.UserView;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            logger.info(teacher.toString());
        }
    }

    public void sendOnConsoleTeacher(Teacher teacher) {
        logger.info(teacher.toString());
    }
}