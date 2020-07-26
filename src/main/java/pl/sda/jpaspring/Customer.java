package pl.sda.jpaspring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;

    public Customer() {

    }

    public Customer( String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}
