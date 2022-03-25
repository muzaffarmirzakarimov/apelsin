package com.example.apelsin.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,unique = true)
    private String username;
    private String password;



    private String country;
    private String address;
    private Integer phone;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customers customers = (Customers) o;
        return id != null && Objects.equals(id, customers.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
