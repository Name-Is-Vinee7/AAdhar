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
	private String FirstName;
	private String LastName;
	private String AAdharNum;
	
	   public long getID() {
	    	  return ID;
	      }
	      public void setID(long ID) {
	    	  this.ID =ID;
	      }
	      
	      public String getFirstName() {
	    	  return FirstName;
	      }
	      public void setFirstName(String FirstName) {
	    	  this.FirstName = FirstName;
	      }
	      
	      public String getLastName() {
	    	  return LastName;
	      }
	      public void setLastName(String LastName) {
	    	  this.LastName = LastName;
	      }
	      
	      public String getAAdharNum() {
	    	  return AAdharNum;
	      }
	      public void setAAdharNum(String AAdharNum) {
	    	  this.AAdharNum = AAdharNum;
	      }
	      
	      public AAdhar(long ID,String FirstName,String LastName,String AAdharNum) {
	    	  this.ID=ID;
	    	  this.FirstName=FirstName;
	    	  this.LastName=LastName;
	    	  this.AAdharNum = AAdharNum;
	      }
	      
	      public AAdhar() {
	    	  
	      }
	        
	      public String toString() {
	    	  return "AAdhar{"+"ID = "+ID+", FirstName= '"+FirstName+'\''+", LastName= '"+LastName+'\''+", AAdharNum= '"+AAdharNum+'\''+'}';
	      }
	
}
