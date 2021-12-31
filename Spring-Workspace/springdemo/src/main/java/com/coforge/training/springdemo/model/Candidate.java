package com.coforge.training.springdemo.model;

//Constructor Injection with dependent Object of Address
//Loosely Coupled Class
public class Candidate {

	private int id;
    private String name;
    
    private Address a;// Aggregation
    
    public Candidate() {
    	
    	System.out.println("Candidate details: ");
    }

    
	public Candidate(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
    
	public void disp()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
    
}
