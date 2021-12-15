package com.donnu.demo.hibernate_relations.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="owners")
public class Owners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="owners_id")
    private int owners_id;

    @Column(name="owners_name")
    private String owners_name;

    @Column(name="owners_surname")
    private String owners_surname;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name="pets_owners",
            joinColumns = @JoinColumn(name="owners_id"),
            inverseJoinColumns = @JoinColumn(name="pets_id"))
    private List<Pets> pets;

    public void addOwnerForPet(Pets pet) {
        if (pets == null) {
            pets = new ArrayList<>();
        }
        pets.add(pet);
    }

    public Owners() {

    }

    public Owners(String owners_name, String owners_surname) {
        this.owners_name = owners_name;
        this.owners_surname = owners_surname;
    }

    public int getOwners_id() {
        return owners_id;
    }

    public void setOwners_id(int owners_id) {
        this.owners_id = owners_id;
    }

    public String getOwners_name() {
        return owners_name;
    }

    public void setOwners_name(String owners_name) {
        this.owners_name = owners_name;
    }

    public String getOwners_surname() {
        return owners_surname;
    }

    public void setOwners_surname(String owners_surname) {
        this.owners_surname = owners_surname;
    }

    @Override
    public String toString() {
        return "Owners{" +
                "owners_id=" + owners_id +
                ", owners_name='" + owners_name + '\'' +
                ", owners_surname='" + owners_surname + '\'' +
                '}';
    }
}
