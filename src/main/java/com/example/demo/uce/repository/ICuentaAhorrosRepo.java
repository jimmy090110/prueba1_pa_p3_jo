package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaAhorros;

public interface ICuentaAhorrosRepo {
	
	public void insertar(CuentaAhorros cuentaAhorros);
	
	public void actualizar(CuentaAhorros cuentaAhorros);
	
	public CuentaAhorros buscar(Integer id);
	
	public void eliminar(Integer id);
	
	

}
