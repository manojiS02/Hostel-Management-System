package util;

import entity.Reservation;
import entity.Room;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() throws IOException {
        Configuration configuration = new Configuration().configure("/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).addAnnotatedClass(Room.class).addAnnotatedClass(Reservation.class);

        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Room.class);
        configuration.addAnnotatedClass(Reservation.class);

        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance() throws IOException {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
