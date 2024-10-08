package pro.backend.spring.py_backend_spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.backend.spring.py_backend_spring.dto.VentaDto;
import pro.backend.spring.py_backend_spring.model.Venta;
import pro.backend.spring.py_backend_spring.repository.VentaRepository;
import pro.backend.spring.py_backend_spring.service.impl.IVentasService;
import pro.backend.spring.py_backend_spring.util.VentaConvert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VentaService implements IVentasService {

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
}
