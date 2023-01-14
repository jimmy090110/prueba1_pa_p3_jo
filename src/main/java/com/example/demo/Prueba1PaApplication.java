package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.repository.ICuentaAhorrosRepo;
import com.example.demo.uce.repository.ICuentaBancariaRepo;
import com.example.demo.uce.repository.ICuentaCorrienteRepo;
import com.example.demo.uce.service.ICuentaAhorrosService;
import com.example.demo.uce.service.ICuentaBancariaService;

@SpringBootApplication
public class Prueba1PaApplication implements CommandLineRunner {
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ICuentaAhorrosService ahorrosService;
	
	@Autowired
	private ICuentaCorrienteRepo corrienteRepo;

	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
