package br.edu.ifce.tjw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.tjw.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long>{

}
