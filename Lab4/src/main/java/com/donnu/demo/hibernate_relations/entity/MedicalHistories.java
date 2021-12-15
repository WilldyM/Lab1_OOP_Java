package com.donnu.demo.hibernate_relations.entity;

import javax.persistence.*;

@Entity
@Table(name="medical_histories")
public class MedicalHistories {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="medical_histories_id")
    private int medical_histories_id;

    @Column(name="medical_histories_number")
    private int medical_histories_number;

    @OneToOne(mappedBy = "petMH", cascade = CascadeType.ALL)
    private Pets pet;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="doctors_id")
    private Doctors doctor;

    public MedicalHistories() {

    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pets) {
        this.pet = pets;
    }

    public MedicalHistories(int medical_histories_number) {
        this.medical_histories_number = medical_histories_number;
    }

    public int getMedical_histories_id() {
        return medical_histories_id;
    }

    public void setMedical_histories_id(int medical_histories_id) {
        this.medical_histories_id = medical_histories_id;
    }

    public int getMedical_histories_number() {
        return medical_histories_number;
    }

    public void setMedical_histories_number(int medical_histories_number) {
        this.medical_histories_number = medical_histories_number;
    }

    @Override
    public String toString() {
        return "MedicalHistories{" +
                "medical_histories_id=" + medical_histories_id +
                ", medical_histories_number=" + medical_histories_number +
                ", pet=" + pet +
                '}';
    }
}
