package main.java.cz.secda1.spsmb.javaJpaExample;


import cz.secda1.spsmb.javaJpaExample.model.User;
import cz.secda1.spsmb.javaJpaExample.repository.UserRepository;
import cz.secda1.spsmb.javaJpaExample.services.DbFactory;
import org.hibernate.Session;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session = new DbFactory().getSession();

        session.beginTransaction();
        User user1 = new User();
        user1.setName("Jan");
        user1.setSurname("Holan");
        user1.setEmail("someJansEmail@email.com");
        user1.setPassword("superTajneHeslo");
        user1.setAddress("Na Praze 1");

        session.persist(user1);
        session.getTransaction().commit();

        List<User> allUsers = UserRepository.getAllUsers(session);
        User foundUser = UserRepository.getUserById(session, 1L);

        System.out.println(allUsers);
        System.out.println(foundUser);







    }
}
