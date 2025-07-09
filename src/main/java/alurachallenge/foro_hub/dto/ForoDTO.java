package alurachallenge.foro_hub.dto;

public record ForoDTO(
    String titulo,
    String mensaje,
    Long idCurso,
    Long idUsuario,
    Long idCategoria
) {
}
