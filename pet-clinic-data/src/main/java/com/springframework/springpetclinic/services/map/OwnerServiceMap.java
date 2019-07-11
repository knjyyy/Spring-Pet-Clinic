package com.springframework.springpetclinic.services.map;

import java.util.Set;

import javax.persistence.Id;

import com.springframework.springpetclinic.model.Owner;
import com.springframework.springpetclinic.services.CrudService;
import com.springframework.springpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findall() {
		return super.findAll();
	}

	@Override
	public Owner findById(Id id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Id id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}