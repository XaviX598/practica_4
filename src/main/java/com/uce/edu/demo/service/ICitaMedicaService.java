package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ICitaMedicaService {
	
	public void agendar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedulaDoctor, String cedulaPaciente);
	
	

}
