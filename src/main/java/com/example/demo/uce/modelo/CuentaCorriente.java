package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_corriente")
public class CuentaCorriente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "banc_seq")
	@SequenceGenerator(name = "banc_seq", sequenceName = "banc_seq", allocationSize = 1)
	@Column(name="cuenta_corriente_id")
	private Integer id;
	
	@Column(name="cuenta_coriente_fecha_transferencia")
	private LocalDateTime fechaTransferencia;
	
	@Column(name="cuenta_corriente_origen")
	private String cuentaOrigen;
	
	@Column(name="cuenta_corriente_destino")
	private String cuentaDestino;
	
	@Column(name="cuenta_corriente_monto")
	private BigDecimal montoTransferencia;
	
	@Column(name="cuenta_corriente_comision")
	private BigDecimal comision_Transferencia;
	
	
	//GET AND SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public BigDecimal getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(BigDecimal montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public BigDecimal getComision_Transferencia() {
		return comision_Transferencia;
	}

	public void setComision_Transferencia(BigDecimal comision_Transferencia) {
		this.comision_Transferencia = comision_Transferencia;
	}
	
	
	
	
	
	
	

}
