package com.donnu.demo.hibernate_relations.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="doctors")
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctors_id")
    private int doctors_id;

    @Column(name="doctors_name")
    private String doctors_name;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="pets_id")
    private Pets pet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    private List<MedicalHistories> medicalHistories;

    public Doctors() {

    }

    public Doctors(String doctors_name) {
        this.doctors_name = doctors_name;
    }

    public void addMedicalHistoriesToDoctors(MedicalHistories medicalHistory) {
        if (medicalHistories == null) {
            medicalHistories = new ArrayList<>();
        }
        medicalHistories.add(medicalHistory);
        medicalHistory.setDoctor(this);
    }

    public int getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(int doctors_id) {
        this.doctors_id = doctors_id;
    }

    public String getDoctors_name() {
        return doctors_name;
    }

    public void setDoctors_name(String doctors_name) {
        this.doctors_name = doctors_name;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }

    public List<MedicalHistories> getMedicalHistories() {
        return medicalHistories;
    }

    public void setMedicalHistories(List<MedicalHistories> medicalHistories) {
        this.medicalHistories = medicalHistories;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "doctors_id=" + doctors_id +
                ", doctors_name='" + doctors_name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
