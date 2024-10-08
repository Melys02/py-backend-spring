package pro.backend.spring.py_backend_spring.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.math.BigDecimal;
import java.time.LocalDate;


@Builder
@Data

public class VentaDto {

    private Long idVenta;


    private EquipoMarino equipoMarino;


    private Cliente cliente;

    private LocalDate fechaVenta;
    private BigDecimal montoTotal;

}
