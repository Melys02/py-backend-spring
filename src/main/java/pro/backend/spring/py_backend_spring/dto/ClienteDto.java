package pro.backend.spring.py_backend_spring.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClienteDto {

    private Long idCliente;

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

}
