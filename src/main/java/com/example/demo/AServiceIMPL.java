package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServiceIMPL implements AService {

	@Autowired
	private ARepositary repositary;
	
	@Override
	public AAdhar SaveAadhar(AAdhar aadhar) {
		// TODO Auto-generated method stub
		return repositary.save(aadhar);
	}

	@Override
	public List<AAdhar> fetchAAdharList() {
		// TODO Auto-generated method stub
		return repositary.findAll();
	}

}
