package pro.backend.spring.py_backend_spring.service.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pro.backend.spring.py_backend_spring.dto.EquipoMarinoDto;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.math.BigDecimal;
import java.util.List;

public interface IEquipoMarinoService {

    List<EquipoMarinoDto> buscarPorTipo(String tipo);

    List<EquipoMarinoDto> buscarPorEstado(String estado);

    List<EquipoMarinoDto> buscarPorFabricante(String fabricante);

    List<EquipoMarinoDto> buscarPorPrecioMayorA(BigDecimal precio);

}
