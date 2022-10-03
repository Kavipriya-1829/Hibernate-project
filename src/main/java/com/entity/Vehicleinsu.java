package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findVehicleinsuByCust_Name",  
	        query = "from Vehicleinsu v where v.cust_name = :cust_name"  
	        )
	    }  
	)

@Entity
@Table(name="vehicleinsu")
public class Vehicleinsu 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cust_no")
	private int cust_no;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="policy_no")
	private long policy_no;
	@Column(name="vehicle_type")
	private String vehicle_type;
	@Column(name="contactno")
	private long contactno;
	
	public Vehicleinsu()
	{
		
	}

	public Vehicleinsu(String cust_name, long policy_no, String vehicle_type, long contactno) {
		super();
		this.cust_name = cust_name;
		this.policy_no = policy_no;
		this.vehicle_type = vehicle_type;
		this.contactno = contactno;
	}

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public long getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(long policy_no) {
		this.policy_no = policy_no;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Customer [cust_no=" + cust_no + ", cust_name=" + cust_name + ", policy_no=" + policy_no
				+ ", vehicle_type=" + vehicle_type + ", contactno=" + contactno + "]";
	}
	
	
}
