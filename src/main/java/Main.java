import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}