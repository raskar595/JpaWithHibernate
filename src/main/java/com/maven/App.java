package com.maven;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
//		int flag=1;
//		while(flag!=0) {
//			
//			System.out.println("Enter the Developer Name: ");
//			String name=sc.next();
//			
//			System.out.println("Enter the Position Name: ");
//			String position=sc.next();
//			
//			System.out.println("Enter the Salary Name: ");
//			String salary=sc.next();
//			
//			Developer dv=new Developer();
//			
//			dv.setName(name);
//			dv.setPosition(position);
//			dv.setSalary(salary);
//			
//			em.persist(dv);
//			System.out.println("do you want's to add another record.....yes or no...!");
//			String str=sc.next();
//			
//			if(str.equals("yes")) {
//				
//				
//			}
//			else {
//				flag=0;
//			}
//		}
//		
//		System.out.println("Data inserted");
//		
		
//		//Update
		Developer obj=em.find(Developer.class, 1);
		
		System.out.println(obj);

		//delete
		
//		Developer obj=em.find(Developer.class, 3);
//		em.remove(obj);
//		
//		System.out.println("Data deleted");
		
		
		em.getTransaction().commit();
		
		

	}

}
