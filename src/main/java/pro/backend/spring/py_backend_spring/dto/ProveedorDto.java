package pro.backend.spring.py_backend_spring.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProveedorDto {
    private Long idProveedor;

    private String nombre;
    private String contacto;
    private String telefono;

}
