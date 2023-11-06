package Lesson_09;

import Lesson_09.dao.Admin;
import Lesson_09.dao.HumanDAO;
import Lesson_09.dao.User;

public class Main {
    public static void main(String[] args) {
        // DAO - data access object
        // CRUD - create read update delete
        HumanDAO dao = new HumanDAO();
        User user = new User("userOfSite", "user@gmail.ru");
        Admin admin = new Admin("adminOfSite", "admin@gmail.ru");

        dao.create(user);
        dao.read(user.getName());
        dao.update(user);
        dao.delete(user);

        dao.create(admin);
        dao.read(admin.getName());
        dao.update(user);
        dao.delete(user);

    }
}
