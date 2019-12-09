package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Specialty;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.SpecialtyService;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialtyService specialtyService;
	
	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet entity) {
		
		if (!entity.getSpecialties().isEmpty()) {
			entity.getSpecialties().forEach(specialty -> {
				if (specialty.getId() == null) {
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		
		return super.save(entity);
	}
	
	@Override
	public void delete(Vet entity) {
		super.delete(entity);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}