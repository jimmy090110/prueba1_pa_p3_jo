package com.example.demo.uce.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaCorriente;
import com.example.demo.uce.repository.ICuentaCorrienteRepo;

@Service
public class CuentaCorrienteServiceImpl implements ICuentaCorrienteService {

		@Autowired
	private ICuentaCorrienteRepo cuentaCorrienteRepo;
	@Override
	public void insertar(CuentaCorriente cuentaCorriente) {
		// TODO Auto-generated method stub
		this.cuentaCorrienteRepo.insertar(cuentaCorriente);
	}

	@Override
	public void actualizar(CuentaCorriente cuentaCorrientes) {
		// TODO Auto-generated method stub
		this.cuentaCorrienteRepo.actualizar(cuentaCorrientes);
	}

	@Override
	public CuentaCorriente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaCorrienteRepo.eliminar(id);
		
	}

}
