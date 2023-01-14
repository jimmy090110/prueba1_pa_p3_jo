package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CuentaAhorros;

public interface ICuentaAhorrosService {
public void insertar(CuentaAhorros cuentaAhorros);
	
	public void actualizar(CuentaAhorros cuentaAhorros);
	
	public CuentaAhorros buscar(Integer id);
	
	public void eliminar(Integer id);

}
