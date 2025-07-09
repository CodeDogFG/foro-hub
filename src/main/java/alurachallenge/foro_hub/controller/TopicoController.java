package alurachallenge.foro_hub.controller;

import alurachallenge.foro_hub.dto.ForoDTO;
import alurachallenge.foro_hub.model.DatosRegistroTopico;
import alurachallenge.foro_hub.model.Topico;
import alurachallenge.foro_hub.repository.TopicoRepository;
import jakarta.transaction.Transactional;
import java.net.URI;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<ForoDTO> registrarTopico(
            // 1. Recibimos el DTO con los datos para el registro.
            //    Usamos @Valid para activar las validaciones que definimos.
            @RequestBody @Valid DatosRegistroTopico datosRegistro,
            UriComponentsBuilder uriBuilder) {

        // 2. Usamos el servicio para crear y guardar la entidad Topico.
        //    (Recuerda que movimos la lógica de negocio a TopicoService).
        Topico topicoGuardado = topicoService.registrar(datosRegistro);

        // 3. Creamos el DTO de respuesta (ForoDTO) a partir de la entidad ya guardada.
        ForoDTO responseDto = new ForoDTO(topicoGuardado);

        // 4. Creamos la URL del nuevo recurso.
        URI url = uriBuilder.path("/topicos/{id}").buildAndExpand(topicoGuardado.getId()).toUri();

        // 5. Devolvemos la respuesta HTTP 201 Created.
        return ResponseEntity.created(url).body(responseDto);
    }


}
