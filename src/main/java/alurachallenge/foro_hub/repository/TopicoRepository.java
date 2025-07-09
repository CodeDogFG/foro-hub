package alurachallenge.foro_hub.repository;
import alurachallenge.foro_hub.model.Topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

    Page<Topico> findByStatusTrue(Pageable pageable);

    boolean existedByTituloAndMensaje(String titulo, Long mensaje);

}
