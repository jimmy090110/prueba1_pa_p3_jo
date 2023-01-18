package com.example.demo.correcion.service;

import com.example.demo.correc.modelo.Cuenta;

public interface ICuentaService {

	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void eliminar(String numero);
}
