package pro.backend.spring.py_backend_spring.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.backend.spring.py_backend_spring.dto.VentaDto;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;
import pro.backend.spring.py_backend_spring.model.Venta;
import pro.backend.spring.py_backend_spring.repository.VentaRepository;
import pro.backend.spring.py_backend_spring.service.impl.IVentasService;
import pro.backend.spring.py_backend_spring.util.VentaConvert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VentasService implements IVentasService {

    private final VentaRepository ventaRepository;
    private final VentaConvert ventaConvert;

    @Override
    public List<VentaDto> buscarPorCliente(Long idCliente) {
        List<VentaDto> ventaDtos = new ArrayList<>();
        for (Venta venta : ventaRepository.buscarPorCliente(idCliente)) {
            ventaDtos.add(ventaConvert.convertirVentaAVentaDto(venta));
        }
        return ventaDtos;
    }

    @Override
    public List<VentaDto> buscarPorRangoDeFechas(LocalDate fechaFin) {
        List<VentaDto> ventaDtos = new ArrayList<>();
        for (Venta venta : ventaRepository.buscarPorRangoDeFechas(fechaFin)) {
            ventaDtos.add(ventaConvert.convertirVentaAVentaDto(venta));
        }
        return ventaDtos;
    }

    @Override
    public void actualizarMontoTotal(BigDecimal montoTotal, Long idVenta) {
        ventaRepository.actualizarMontoTotal(montoTotal, idVenta);

    }

    @Override
    public void registrarVenta(EquipoMarino equipoMarino, Cliente cliente, LocalDate fechaVenta, BigDecimal montoTotal) {
        ventaRepository.registrarVenta(equipoMarino, cliente, fechaVenta, montoTotal);

    }

    @Override
    public void actualizarClienteVenta(Long idVenta, Cliente cliente) {
        ventaRepository.actualizarClienteVenta(idVenta, cliente);

    }


}
