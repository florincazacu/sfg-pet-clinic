package com.example.sfgpetclinic.services.springdatajpa;

import com.example.sfgpetclinic.model.Visit;
import com.example.sfgpetclinic.repositories.VisitRepository;
import com.example.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {
	
	private final VisitRepository visitRepository;
	
	public VisitSDJpaService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}
	
	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}
	
	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}
	
	@Override
	public Visit save(Visit entity) {
		return visitRepository.save(entity);
	}
	
	@Override
	public void delete(Visit entity) {
		visitRepository.delete(entity);
	}
	
	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}
}
