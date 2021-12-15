package com.donnu.demo.hibernate_relations.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pets")
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pets_id")
    private int pets_id;

    @Column(name="pets_name")
    private String pets_name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="medical_histories_id")
    private MedicalHistories petMH;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet", fetch = FetchType.EAGER)
    private List<Doctors> doctors;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name="pets_owners",
            joinColumns = @JoinColumn(name="pets_id"),
            inverseJoinColumns = @JoinColumn(name="owners_id"))
    private List<Owners> owners;

    public List<Owners> getOwners() {
        return owners;
    }

    public void addOwnerForPet(Owners owner) {
        if (owners == null) {
            owners = new ArrayList<>();
        }
        owners.add(owner);
    }

    public Pets() {

    }

    public Pets(String pets_name) {
        this.pets_name = pets_name;
    }

    public void addDoctorsToPet(Doctors doctor) {
        if (doctors == null) {
            doctors = new ArrayList<>();
        }
        doctors.add(doctor);
        doctor.setPet(this);
    }

    public MedicalHistories getPetMH() {
        return petMH;
    }

    public void setPetMH(MedicalHistories petMH) {
        this.petMH = petMH;
    }

    public int getPets_id() {
        return this.pets_id;
    }

    public void setPets_id(int pets_id) {
        this.pets_id = pets_id;
    }

    public String getPets_name() {
        return pets_name;
    }

    public void setPets_name(String pets_name) {
        this.pets_name = pets_name;
    }

    public List<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctors> doctors) {
        this.doctors = doctors;
    }

    public void setOwners(List<Owners> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "pets_id=" + pets_id +
                ", pets_name='" + pets_name + '\'' +
                ", petMH=" + petMH +
                '}';
    }
}
