package alurachallenge.foro_hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import alurachallenge.foro_hub.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
