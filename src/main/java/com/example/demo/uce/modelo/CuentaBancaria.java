package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="banc_cuena")
public class CuentaBancaria {
	
	@Id
	@Column(name="banc_numero")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "banc_seq")
	@SequenceGenerator(name = "banc_seq", sequenceName = "banc_seq", allocationSize = 1)
	private String numero;
	
	@Column(name="banc_tipo")
	private String tipo;
	
	@Column(name="banc_saldo")
	private String saldo;
	
	@Column(name="banc_cedula_propietario")
	private String cedula_Propietario;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getCedula_Propietario() {
		return cedula_Propietario;
	}

	public void setCedula_Propietario(String cedula_Propietario) {
		this.cedula_Propietario = cedula_Propietario;
	}
	
	

}
