package com.example.sfgpetclinic.services.springdatajpa;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.repositories.PetRepository;
import com.example.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	
	private final PetRepository petRepository;
	
	public PetSDJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}
	
	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}
	
	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}
	
	@Override
	public Pet save(Pet entity) {
		return petRepository.save(entity);
	}
	
	@Override
	public void delete(Pet entity) {
		petRepository.delete(entity);
	}
	
	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}
}
