package alurachallenge.foro_hub.controller;

import alurachallenge.foro_hub.model.DatosRegistroTopico;
import alurachallenge.foro_hub.model.Topico;
import alurachallenge.foro_hub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
        Topico topico = new Topico(null, datosRegistroTopico.titulo(), datosRegistroTopico.mensaje(), null, null, datosRegistroTopico.autor(), datosRegistroTopico.curso());
        topicoRepository.save(topico);


    }
}
