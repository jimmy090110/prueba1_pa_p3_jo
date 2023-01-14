package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.repository.ICuentaAhorrosRepo;
import com.example.demo.uce.repository.ICuentaBancariaRepo;
import com.example.demo.uce.repository.ICuentaCorrienteRepo;

public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	
	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Autowired
	private ICuentaCorrienteRepo corrienteRepo;
	
	@Autowired
	private ICuentaAhorrosRepo ahorrosRepo;
	
	
	public void crear(String numero, String tipo,String saldo,String cedulaPropietari) {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.setCedula_Propietario("4314151355");
		cuentaBancaria.setSaldo("254");
		cuentaBancaria.setTipo("Ahorros");
		
		CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
		cuentaBancaria2.setCedula_Propietario("123456789");
		cuentaBancaria2.setSaldo("7654");
		cuentaBancaria2.setTipo("Corriente");
		
		
		
		
		
		
	}
}
