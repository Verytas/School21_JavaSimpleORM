package app;

import com.zaxxer.hikari.HikariDataSource;
import models.User;

public class Program {

    public static void main(String[] args) {
        try (HikariDataSource dataSource = new HikariDataSource()) {
            dataSource.setJdbcUrl("jdbc:postgresql://localhost/");
            dataSource.setUsername("ltapioca");
            dataSource.setPassword("");

            OrmManager ormManager = new OrmManager(dataSource);
            User user = new User("Ivan", "Ivanov", 30);

            ormManager.save(user);
            user = ormManager.findById(1L, User.class);
            user.setId(1L);
            user.setFirstName("Petr");
            user.setLastName("Petrov");
            user.setAge(25);
            ormManager.update(user);
            user = ormManager.findById(1L, User.class);
            System.out.println(user);
        }
    }
}
