package alurachallenge.foro_hub.model;

public record DatosRegistroTopico(
        @NotBlank(message = "El título no puede estar vacío")
        String titulo,

        @NotBlank(message = "El mensaje no puede estar vacío")
        String mensaje,

        @NotBlank(message = "El autor no puede estar vacío")
        Long idAutor,

        @NotBlank(message = "El curso no puede estar vacío")
        Long idCurso) {

}
