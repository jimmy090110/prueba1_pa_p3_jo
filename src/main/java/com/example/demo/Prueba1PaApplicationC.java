package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correc.modelo.Cuenta;
import com.example.demo.correcion.service.ICuentaService;
import com.example.demo.correcion.service.ITransferenciaService;





@SpringBootApplication
public class Prueba1PaApplicationC implements CommandLineRunner {
	
	@Autowired
	private ICuentaService cuentaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;


	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaApplicationC.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.setNumero("12345");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedulaPropietario("1234567789");
		this.cuentaService.insertar(cuentaOrigen);
		
		
		Cuenta cuentaDestino = new Cuenta();
		cuentaOrigen.setNumero("54321");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedulaPropietario("9876543219");
		this.cuentaService.insertar(cuentaDestino);
		
		this.iTransferenciaService.realizar("132", "133", new BigDecimal(10));
		System.out.println(cuentaOrigen.getSaldo());
		
		System.out.println("El saldo actual es:");
		System.out.println(this.cuentaService.buscar("132").getSaldo()));
	}

}
