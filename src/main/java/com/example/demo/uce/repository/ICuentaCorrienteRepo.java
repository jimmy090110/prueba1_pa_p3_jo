package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaCorriente;

public interface ICuentaCorrienteRepo {
public void insertar(CuentaCorriente cuentaCorriente);
	
	public void actualizar(CuentaCorriente cuentaCorrientes);
	
	public CuentaCorriente buscar(Integer id);
	
	public void eliminar(Integer id);

}
