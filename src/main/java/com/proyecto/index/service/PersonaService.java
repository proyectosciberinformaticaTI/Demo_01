package com.proyecto.index.service;

import java.util.List;
import java.util.Optional;


import com.proyecto.index.bean.tablapersona;
import com.proyecto.index.inter.IpersonaService;
import com.proyecto.index.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IpersonaService {
	

	private PersonaRepository data;

	@Autowired
public PersonaService(PersonaRepository dat){
		this.data=dat;
}
	@Override
	public List<tablapersona> listar() {
		// TODO Auto-generated method stub
		return (List<tablapersona>) data.findAll();
	}

	@Override
	public Optional<tablapersona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(tablapersona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
