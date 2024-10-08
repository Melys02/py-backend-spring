package pro.backend.spring.py_backend_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.backend.spring.py_backend_spring.dto.GenericResponseDto;
import pro.backend.spring.py_backend_spring.model.OrdenMantenimiento;
import pro.backend.spring.py_backend_spring.service.OrdenMantenimientoService;
import pro.backend.spring.py_backend_spring.service.impl.IOrdenMantenimientoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/ordenmantenimiento")
public class OrdenMantenimientoController {
    private final IOrdenMantenimientoService ordenMantenimientoService;

    @GetMapping("/buscarPorEstado/{estado}")
    public ResponseEntity<GenericResponseDto<List<OrdenMantenimiento>>> buscarPorEstado(@PathVariable String estado) {
        try {
            // Llamada al servicio para buscar órdenes de mantenimiento por estado
            List<OrdenMantenimiento> ordenesMantenimiento = ordenMantenimientoService.findByEstado(estado);

            // Construir respuesta exitosa
            GenericResponseDto<List<OrdenMantenimiento>> respuesta = GenericResponseDto.<List<OrdenMantenimiento>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(ordenesMantenimiento)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<OrdenMantenimiento>> respuestaError = GenericResponseDto.<List<OrdenMantenimiento>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscarPorEquipo/{idEquipo}")
    public ResponseEntity<GenericResponseDto<List<OrdenMantenimiento>>> buscarPorEquipo(@PathVariable Long idEquipo) {
        try {
            // Llamada al servicio para buscar órdenes de mantenimiento por equipo
            List<OrdenMantenimiento> ordenesMantenimiento = ordenMantenimientoService.findByEquipoMarino_IdEquipo(idEquipo);

            // Construir respuesta exitosa
            GenericResponseDto<List<OrdenMantenimiento>> respuesta = GenericResponseDto.<List<OrdenMantenimiento>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(ordenesMantenimiento)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<OrdenMantenimiento>> respuestaError = GenericResponseDto.<List<OrdenMantenimiento>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
