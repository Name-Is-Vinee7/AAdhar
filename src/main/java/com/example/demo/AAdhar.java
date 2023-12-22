package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AAdhar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String firstName;
	private String lastName;
	private String aAdharNum;
	
	   public long getID() {
	    	  return ID;
	      }
	      public void setID(long ID) {
	    	  this.ID =ID;
	      }
	      
	      public String getfirstName() {
	    	  return firstName;
	      }
	      public void setFirstName(String firstName) {
	    	  this.firstName = firstName;
	      }
	      
	      public String getlastName() {
	    	  return lastName;
	      }
	      public void setLastName(String lastName) {
	    	  this.lastName = lastName;
	      }
	      
	      public String getaAdharNum() {
	    	  return aAdharNum;
	      }
	      public void setAAdharNum(String aAdharNum) {
	    	  this.aAdharNum = aAdharNum;
	      }
	      
	      public AAdhar(long ID,String firstName,String lastName,String aAdharNum) {
	    	  this.ID=ID;
	    	  this.firstName=firstName;
	    	  this.lastName=lastName;
	    	  this.aAdharNum = aAdharNum;
	      }
	      
	      public AAdhar() {
	    	  
	      }
	        
	      public String toString() {
	    	  return "AAdhar{"+"ID = "+ID+", FirstName= '"+firstName+'\''+", LastName= '"+lastName+'\''+", AAdharNum= '"+aAdharNum+'\''+'}';
	      }
	
}
