package com.entity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CustomerMain 
{
	public static void main(String[] args) 
	{
	     StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();
	      //Hibernate Named Query    
	           TypedQuery<Vehicleinsu> query = session.getNamedQuery("findVehicleinsuByCust_Name");    
	            query.setParameter("cust_name","Hariprasath");   
	                   
	            List<Vehicleinsu> vehicleinsu=query.getResultList();
	            
	    Iterator<Vehicleinsu> itr=vehicleinsu.iterator();    
	     while(itr.hasNext()){    
	    	 Vehicleinsu v=itr.next();    
	    System.out.println(v.getCust_name()); 
	    System.out.println(v.getPolicy_no());
	    System.out.println(v.getVehicle_type());
	    System.out.println(v.getContactno());
	     }    
	    session.close();
}
}
