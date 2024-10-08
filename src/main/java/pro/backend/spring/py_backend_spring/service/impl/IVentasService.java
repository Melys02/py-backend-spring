package pro.backend.spring.py_backend_spring.service.impl;

import pro.backend.spring.py_backend_spring.dto.VentaDto;

import java.time.LocalDate;
import java.util.List;

public interface IVentasService {
    List<VentaDto> buscarPorCliente(Long idCliente);

    List<VentaDto> buscarPorRangoDeFechas(LocalDate fechaFin);
}
