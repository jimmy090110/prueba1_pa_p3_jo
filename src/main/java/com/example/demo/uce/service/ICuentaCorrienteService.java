package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CuentaCorriente;

interface ICuentaCorrienteService {

public void insertar(CuentaCorriente cuentaCorriente);
	
	public void actualizar(CuentaCorriente cuentaCorrientes);
	
	public CuentaCorriente buscar(Integer id);
	
	public void eliminar(Integer id);
}
