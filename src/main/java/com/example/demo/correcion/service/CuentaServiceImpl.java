package com.example.demo.correcion.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.correc.modelo.Cuenta;
import com.example.demo.correc.repository.ICuentaRepo;

public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepo cuentaRepo;
	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertar(cuenta);
		
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	public Cuenta buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepo.eliminar(numero);
		
	}

}
