package pro.backend.spring.py_backend_spring.util;

import pro.backend.spring.py_backend_spring.dto.VentaDto;
import pro.backend.spring.py_backend_spring.model.Venta;

public class VentaConvert {



    public VentaDto ventaDto(Venta venta) {
        return VentaDto.builder()
                .idVenta(venta.getIdVenta())
                .equipoMarino(venta.getEquipoMarino())
                .cliente(venta.getCliente())
                .fechaVenta(venta.getFechaVenta())
                .montoTotal(venta.getMontoTotal())
                .build();
    }


    public VentaDto convertirVentaAVentaDto(Venta venta) {
        return VentaDto.builder()
                .idVenta(venta.getIdVenta())
                .equipoMarino(venta.getEquipoMarino())  // Aquí también podrías convertir a EquipoMarinoDto si lo necesitas
                .cliente(venta.getCliente())  // Similar a EquipoMarino, si usas ClienteDto, puedes realizar la conversión
                .fechaVenta(venta.getFechaVenta())
                .montoTotal(venta.getMontoTotal())
                .build();
    }
}
