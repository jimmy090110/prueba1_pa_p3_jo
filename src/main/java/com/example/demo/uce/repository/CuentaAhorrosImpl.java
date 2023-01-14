package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CuentaAhorros;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaAhorrosImpl implements ICuentaAhorrosRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaAhorros cuentaAhorros) {
		this.entityManager.persist(cuentaAhorros);
		
	}

	@Override
	public void actualizar(CuentaAhorros cuentaAhorros) {
		this.entityManager.merge(cuentaAhorros);
		
	}

	@Override
	public CuentaAhorros buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaAhorros.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuentaAhorros cuentaAhorros = this.buscar(id);
		this.entityManager.remove(cuentaAhorros);
	}

}
