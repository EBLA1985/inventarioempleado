package com.laboratory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.laboratory.repository.EmployeesRepository;

@SpringBootApplication
public class LaboratorioMedicoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LaboratorioMedicoApplication.class, args);
	}
     
	@Autowired
	private EmployeesRepository employeesRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Employees employees1 = new Employees("Edison","Leon");
		employeesRepository.save(employees1);*/
	}

}
