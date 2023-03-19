package flue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flue.model.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
