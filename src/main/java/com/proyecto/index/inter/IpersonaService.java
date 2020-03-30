package com.proyecto.index.inter;


import com.proyecto.index.bean.tablapersona;

import java.util.List;
import java.util.Optional;



public interface IpersonaService {
	
	public List<tablapersona> listar();
	
	public Optional<tablapersona> listarId(int id);
	
	public int save(tablapersona p);
	
	public void delete(int id);
	
	

}
