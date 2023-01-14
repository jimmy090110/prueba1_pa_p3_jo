package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CuentaCorriente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaCorrienteImpl implements ICuentaCorrienteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaCorriente cuentaCorriente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaCorriente);
		
	}

	@Override
	public void actualizar(CuentaCorriente cuentaCorrientes) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaCorrientes);
		
	}

	@Override
	public CuentaCorriente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaCorriente.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuentaCorriente cuentaCorriente = this.buscar(id);
		this.entityManager.remove(cuentaCorriente);
	}

}
