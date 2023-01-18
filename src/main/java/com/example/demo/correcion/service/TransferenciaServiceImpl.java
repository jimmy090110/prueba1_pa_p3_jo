package com.example.demo.correcion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correc.modelo.Cuenta;
import com.example.demo.correc.modelo.Transferencia;
import com.example.demo.correc.repository.ICuentaRepo;
import com.example.demo.correc.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ICuentaRepo cuentaRepo;
	
	private ITransferenciaRepo iTransferenciaRepo;
	
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		//ORIGEN
		Cuenta origen = this.cuentaRepo.buscar(numeroOrigen);
		BigDecimal comision = monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar=monto.add(comision);
		
		
		//-1 si el de la izquierda es menor
		if(saldoActualOrigen.compareTo(montoDebitar)<0) {
			System.out.println("MONTO NO PERMITIDO!");
			
		}else {
			//ORIGEN
			BigDecimal saldoActualOrigen = origen.getSaldo();
			origen.setSaldo(saldoActualOrigen.subtract(saldoActualOrigen));
			this.cuentaRepo.actualizar(origen);
			
			
			
			//DESTINO
			Cuenta destino = this.cuentaRepo.buscar(numeroDestino);
			BigDecimal saldoActualDestino = destino.getSaldo();
			destino.setSaldo(saldoActualDestino.add(monto));
			this.cuentaRepo.actualizar(destino);
			
			
			//TRANSFERENCIA
			Transferencia transfer = new Transferencia();
			transfer.setComision(comision);
			transfer.setFecha(LocalDateTime.now());
			transfer.setMonto(monto);
			transfer.setNumeroDestino(numeroDestino);
			transfer.setNumeroOrigen(numeroOrigen);
			
			this.iTransferenciaRepo.insertar(null);
		}
		
		
	
	}

}
