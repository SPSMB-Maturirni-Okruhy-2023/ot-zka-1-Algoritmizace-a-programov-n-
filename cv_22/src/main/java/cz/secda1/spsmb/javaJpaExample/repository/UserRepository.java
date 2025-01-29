package main.java.cz.secda1.spsmb.javaJpaExample.repository;

import cz.secda1.spsmb.javaJpaExample.model.User;
import org.hibernate.Session;

import java.util.List;

public class UserRepository {

    public static List<User> getAllUsers(Session session) {
        return session.createQuery("SELECT u from User u", User.class)
                        .getResultList();
    }

    public static User getUserById(Session session, long user_id) {
        return session.createQuery("SELECT u from User u where u.id = :id", User.class)
                .setParameter("id", user_id).getSingleResult();
    }
}
