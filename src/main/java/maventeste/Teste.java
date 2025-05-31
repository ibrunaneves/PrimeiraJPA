package maventeste;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("maventeste");
        EntityManager em = emf.createEntityManager();

        Person person0 = new Person(1, "João Silva", "Campina Grande", 30, 100.0);
        Person person1 = new Person(2, "Maria Silva", "João Pessoa", 28, 200.0);

        em.getTransaction().begin();
        em.persist(person0);
        em.persist(person1);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
