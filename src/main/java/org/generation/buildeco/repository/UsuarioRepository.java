package org.generation.buildeco.repository;

import java.util.Optional;
import org.generation.buildeco.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	
		public Optional<UsuarioModel> findByUsuario(String usuario);
		

}
