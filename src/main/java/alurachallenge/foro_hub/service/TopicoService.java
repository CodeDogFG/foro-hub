package alurachallenge.foro_hub.service;

import alurachallenge.foro_hub.model.Usuario;
import alurachallenge.foro_hub.model.Curso;
import alurachallenge.foro_hub.model.DatosRegistroTopico;
import alurachallenge.foro_hub.model.Topico;
import alurachallenge.foro_hub.repository.CursoRepository;
import alurachallenge.foro_hub.repository.TopicoRepository;
import alurachallenge.foro_hub.repository.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public Topico registrar(DatosRegistroTopico datosRegistro) {
        //Validar que autor y curso existan
        Usuario autor = usuarioRepository.findById(datosRegistro.getAutorId())
                .orElseThrow(() -> new ValidationException("El autor no existe"));
        Curso curso = cursoRepository.findById(datosRegistro.getCursoId)
                .orElseThrow(() -> new ValidationException("El curso no existe"));
        //Validar que no haya un topico duplicado
        if (topicoRepository.existsByTitulo(datosRegistro.getTitulo())) {
            throw new ValidationException("Ya existe un tópico con el mismo título");
        }
        // Crear y guardar el nuevo tópico
        Topico nuevoTopico = new Topico(datosRegistro, autor, curso);
        return topicoRepository.save(nuevoTopico);

    }


}
