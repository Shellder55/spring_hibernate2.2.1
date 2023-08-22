package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getUserByModelAndSeries(String model, int series);

    List<User> listUsers();
}
