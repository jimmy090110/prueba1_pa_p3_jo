package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaAhorros;
import com.example.demo.uce.repository.ICuentaAhorrosRepo;

@Service
public class CuentaAhorrosServiceImpl implements ICuentaAhorrosService {

		@Autowired
		private ICuentaAhorrosRepo ahorrosRepo; 
		
	@Override
	public void insertar(CuentaAhorros cuentaAhorros) {
		// TODO Auto-generated method stub
		this.ahorrosRepo.insertar(cuentaAhorros);
		
		
	}

	@Override
	public void actualizar(CuentaAhorros cuentaAhorros) {
		// TODO Auto-generated method stub
		this.ahorrosRepo.actualizar(cuentaAhorros);
		
	}

	@Override
	public CuentaAhorros buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ahorrosRepo.eliminar(id);
		
	}

}
