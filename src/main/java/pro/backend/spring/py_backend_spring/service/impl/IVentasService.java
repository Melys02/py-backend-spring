package pro.backend.spring.py_backend_spring.service.impl;

import org.springframework.data.repository.query.Param;
import pro.backend.spring.py_backend_spring.dto.VentaDto;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IVentasService {
    List<VentaDto> buscarPorCliente(Long idCliente);

    List<VentaDto> buscarPorRangoDeFechas(LocalDate fechaFin);

    void actualizarMontoTotal(BigDecimal montoTotal, Long idVenta);
    void registrarVenta( EquipoMarino equipoMarino, Cliente cliente, LocalDate fechaVenta, BigDecimal montoTotal);
    void actualizarClienteVenta(Long idVenta,Cliente cliente);

}
