package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.PetType;
import com.example.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
	
	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(PetType entity) {
		super.delete(entity);
	}
	
	@Override
	public PetType save(PetType entity) {
		return super.save(entity);
	}
	
	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}
}
