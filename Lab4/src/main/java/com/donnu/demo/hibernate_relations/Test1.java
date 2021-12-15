package com.donnu.demo.hibernate_relations;

import com.donnu.demo.hibernate_relations.entity.Doctors;
import com.donnu.demo.hibernate_relations.entity.MedicalHistories;
import com.donnu.demo.hibernate_relations.entity.Owners;
import com.donnu.demo.hibernate_relations.entity.Pets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Pets.class)
                .addAnnotatedClass(MedicalHistories.class)
                .addAnnotatedClass(Owners.class)
                .addAnnotatedClass(Doctors.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            // ManyToMany
//            Pets pet1 = new Pets("pet3");
//            Pets pet2 = new Pets("pet4");
//            Owners owner1 = new Owners("owner3_1", "owner1_2");
//            Owners owner2 = new Owners("owner4_1", "owner2_2");
//
//            pet1.addOwnerForPet(owner1);
//            pet1.addOwnerForPet(owner2);
//            pet2.addOwnerForPet(owner2);
//
//            session.beginTransaction();
//            session.persist(pet1);
//            session.persist(pet2);
//            session.getTransaction().commit();
//            // END

            session = factory.getCurrentSession();

            Doctors doctor = new Doctors("doc1");
            MedicalHistories medicalHistory = new MedicalHistories(123123);

            session.beginTransaction();

            System.out.println("----Get pet----");
            Pets pet = session.get(Pets.class, 1);
            pet.setPetMH(medicalHistory);
            pet.addDoctorsToPet(doctor);


            System.out.println("----Show pet----");
            System.out.println(pet);
            System.out.println("----Show doctors----");
            System.out.println(pet.getDoctors());
            System.out.println("----Show Medical History----");
            System.out.println(pet.getPetMH());

            session.save(pet);
            session.getTransaction().commit();


        }
        finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
