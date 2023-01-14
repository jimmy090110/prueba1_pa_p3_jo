package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaBancariaImpl implements ICuentaBancariaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaBancaria = this.buscar(numero);
		this.entityManager.remove(cuentaBancaria);
		
	}

}
