package pro.backend.spring.py_backend_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.backend.spring.py_backend_spring.dto.GenericResponseDto;
import pro.backend.spring.py_backend_spring.dto.VentaDto;
import pro.backend.spring.py_backend_spring.service.impl.IVentasService;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/venta")
public class VentaController {
    private final IVentasService ventasService;
    @GetMapping("/buscarPorCliente/{idCliente}")
    public ResponseEntity<GenericResponseDto<List<VentaDto>>> buscarPorCliente(@PathVariable Long idCliente) {
        try {
            // Llamada al servicio para buscar ventas por cliente
            List<VentaDto> ventas = ventasService.buscarPorCliente(idCliente);

            // Construir respuesta exitosa
            GenericResponseDto<List<VentaDto>> respuesta = GenericResponseDto.<List<VentaDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(ventas)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<VentaDto>> respuestaError = GenericResponseDto.<List<VentaDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscarPorRangoDeFechas/{fechaFin}")
    public ResponseEntity<GenericResponseDto<List<VentaDto>>> buscarPorRangoDeFechas(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaFin) {
        try {
            // Llamada al servicio para buscar ventas por rango de fechas
            List<VentaDto> ventas = ventasService.buscarPorRangoDeFechas(fechaFin);

            // Construir respuesta exitosa
            GenericResponseDto<List<VentaDto>> respuesta = GenericResponseDto.<List<VentaDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(ventas)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<VentaDto>> respuestaError = GenericResponseDto.<List<VentaDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
}
