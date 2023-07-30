package com.mahagan.ManyToOneHibernateSaveHB.test;

import com.mahagan.ManyToOneHibernateSaveHB.domain.AllBigCompany;
import com.mahagan.ManyToOneHibernateSaveHB.domain.SmallCompany;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

public class ManyToOneHibernateSaveHbApplicationFetchHB {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery typedQuery = session.createQuery("from SmallCompany smallcompany");
        List<SmallCompany> list = typedQuery.getResultList();
        Iterator<SmallCompany> iterator = list.listIterator();

        while (iterator.hasNext()) {

            SmallCompany smallCompany = iterator.next();
            System.out.println(smallCompany.getSmallcompanyName() + " " + smallCompany.getSmallcomapanyPopulation());

            AllBigCompany allBigCompany = smallCompany.getAllBigCompany();
            System.out.println(allBigCompany.getBigcompanyName()+" "+allBigCompany.getBigcompanyPopulation() );

        }
        session.close();
        System.out.println("Succeefully retrive done");
    }
}


























































