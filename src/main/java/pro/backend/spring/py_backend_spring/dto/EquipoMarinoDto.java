package pro.backend.spring.py_backend_spring.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class EquipoMarinoDto {

    private Long id_equipo;
    //@Column(name = "")
    private String nombre;
    private String tipo;
    private String fabricante;
    private BigDecimal precio;
    private String estado;

}
