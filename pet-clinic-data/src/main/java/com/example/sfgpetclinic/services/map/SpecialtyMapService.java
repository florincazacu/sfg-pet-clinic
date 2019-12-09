package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Specialty;
import com.example.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
	
	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Specialty entity) {
		super.delete(entity);
	}
	
	@Override
	public Specialty save(Specialty entity) {
		return super.save(entity);
	}
	
	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}
	
}
