package alurachallenge.foro_hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import alurachallenge.foro_hub.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
