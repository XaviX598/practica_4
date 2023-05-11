package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;

@Transactional
@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(CitaMedica cita) {
		this.entityManager.persist(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		this.entityManager.merge(cita);
	}

}
