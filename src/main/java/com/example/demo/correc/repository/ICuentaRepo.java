package com.example.demo.correc.repository;

import com.example.demo.correc.modelo.Cuenta;

public interface ICuentaRepo {

		public void insertar(Cuenta cuenta);
		public void actualizar(Cuenta cuenta);
		public Cuenta buscar(String numero);
		public void eliminar(String numero);
}
