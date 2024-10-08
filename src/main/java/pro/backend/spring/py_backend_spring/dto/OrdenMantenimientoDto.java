package pro.backend.spring.py_backend_spring.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.time.LocalDate;
@Builder
@Data
public class OrdenMantenimientoDto {

    private Long idOrden;


    private EquipoMarino equipoMarino;


    private Cliente cliente;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;


}
