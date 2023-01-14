package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	public void insertar(CuentaBancaria cuentaBancaria);
	
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String numero);
	
	public void eliminar(String numero);

}
