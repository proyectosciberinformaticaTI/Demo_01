package com.proyecto.index.repository;


import com.proyecto.index.bean.tablapersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends CrudRepository<tablapersona,Integer> {
}
