package Unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class contrl {
	public static void main(String[] args) {
		
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

  Customers customers=new Customers();
  customers.setCustomer_id(65434);
  customers.setName("gundu");
  customers.setPhone(6535358555l);
  
  Customers customers1=new Customers();
  customers1.setCustomer_id(653534);
  customers1.setName("gundu1");
  customers1.setPhone(6535358423l);
  
  Customers customers2=new Customers();
  customers2.setCustomer_id(654364);
  customers2.setName("gundu2");
  customers2.setPhone(653598505l);
  
  Flipkart flipkart=new Flipkart();
  flipkart.setName("gandu");
  flipkart.setProduct_cost(78543);
  flipkart.setProduct_name("hgkh");
  
  Flipkart flipkart1=new Flipkart();
  flipkart1.setName("gandu1");
  flipkart1.setProduct_cost(785443);
  flipkart1.setProduct_name("gundu pallav");
  
  Flipkart flipkart2=new Flipkart();
  flipkart2.setName("gandu2");
  flipkart2.setProduct_cost(7859843);
  flipkart2.setProduct_name("hamam soap");
  
  
  List<Flipkart> list=new ArrayList<Flipkart>();
  list.add(flipkart);
  list.add(flipkart1);
  list.add(flipkart2);
  
  ArrayList<Customers> list1=new ArrayList<Customers>();
  list1.add(customers);
  list1.add(customers1);
  list1.add(customers2);
  
 customers.setFlipkarts(list);
 customers1.setFlipkarts(list);
 customers2.setFlipkarts(list);
 
 entityTransaction.begin();
 entityManager.persist(flipkart2);
 entityManager.persist(flipkart1);
 entityManager.persist(flipkart);
 entityManager.persist(customers2);
 entityManager.persist(customers1);
 entityManager.persist(customers);
 entityTransaction.commit();
 
 
 
 
  
  
  
  
}
}