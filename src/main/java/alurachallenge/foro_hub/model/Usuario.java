package alurachallenge.foro_hub.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "Usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name= "correoelectronico")
    private String correoElectronico;

    private String contrasena;
}
