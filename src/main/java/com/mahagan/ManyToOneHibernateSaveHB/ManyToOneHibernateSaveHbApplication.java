package com.mahagan.ManyToOneHibernateSaveHB;

import com.mahagan.ManyToOneHibernateSaveHB.domain.AllBigCompany;
import com.mahagan.ManyToOneHibernateSaveHB.domain.SmallCompany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class ManyToOneHibernateSaveHbApplication {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//One Object
		SmallCompany smallCompany = new SmallCompany();
		smallCompany.setSmallcompanyName("TCS");
		smallCompany.setSmallcomapanyPopulation("1.3 Cr");

		//Two Object
		SmallCompany smallCompany1 = new SmallCompany();
		smallCompany1.setSmallcompanyName("Infosys");
		smallCompany1.setSmallcomapanyPopulation("2.3");

		//Three Object
		SmallCompany smallCompany2 = new SmallCompany();
		smallCompany2.setSmallcompanyName("Wipro");
		smallCompany2.setSmallcomapanyPopulation("3.3");

		AllBigCompany allBigCompany = new AllBigCompany();
		allBigCompany.setBigcompanyName("WP");
		allBigCompany.setBigcompanyPopulation("2.3 Cr");

		smallCompany.setAllBigCompany(allBigCompany);
		smallCompany1.setAllBigCompany(allBigCompany);
		smallCompany2.setAllBigCompany(allBigCompany);


		session.persist(smallCompany);
		session.persist(smallCompany1);
		session.persist(smallCompany2);

		transaction.commit();
		session.close();
		System.out.println("succeessfully save HB");

	}
}


















