package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
	
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet entity) {
		return super.save(entity.getId(), entity);
	}
	
	@Override
	public void delete(Pet entity) {
		super.delete(entity);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
