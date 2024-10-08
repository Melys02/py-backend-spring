package pro.backend.spring.py_backend_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.backend.spring.py_backend_spring.dto.EquipoMarinoDto;
import pro.backend.spring.py_backend_spring.dto.GenericResponseDto;
import pro.backend.spring.py_backend_spring.service.impl.IEquipoMarinoService;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/equipomarino")
public class EquipoMarinController {
    private final IEquipoMarinoService equipoMarinoService;


    @GetMapping("/buscarPorTipo/{tipo}")
    public ResponseEntity<GenericResponseDto<List<EquipoMarinoDto>>> buscarPorTipo(@PathVariable String tipo) {
        try {
            List<EquipoMarinoDto> equipos = equipoMarinoService.buscarPorTipo(tipo);

            // Construir la respuesta con éxito
            GenericResponseDto<List<EquipoMarinoDto>> respuesta = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(equipos)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Manejar excepciones y devolver una respuesta con error
            GenericResponseDto<List<EquipoMarinoDto>> respuestaError = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @GetMapping("/buscarPorEstado/{estado}")
    public ResponseEntity<GenericResponseDto<List<EquipoMarinoDto>>> buscarPorEstado(@PathVariable String estado) {
        try {
            List<EquipoMarinoDto> equipos = equipoMarinoService.buscarPorEstado(estado);

            // Construir la respuesta con éxito
            GenericResponseDto<List<EquipoMarinoDto>> respuesta = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(equipos)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Manejar excepciones y devolver una respuesta con error
            GenericResponseDto<List<EquipoMarinoDto>> respuestaError = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscarPorFabricante/{fabricante}")
    public ResponseEntity<GenericResponseDto<List<EquipoMarinoDto>>> buscarPorFabricante(@PathVariable String fabricante) {
        try {
            // Llamada al servicio para buscar equipos por fabricante
            List<EquipoMarinoDto> equipos = equipoMarinoService.buscarPorFabricante(fabricante);

            // Construir respuesta exitosa
            GenericResponseDto<List<EquipoMarinoDto>> respuesta = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(equipos)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<EquipoMarinoDto>> respuestaError = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscarPorPrecioMayorA/{precio}")
    public ResponseEntity<GenericResponseDto<List<EquipoMarinoDto>>> buscarPorPrecioMayorA(@PathVariable BigDecimal precio) {
        try {
            // Llamada al servicio para buscar equipos con precio mayor al valor dado
            List<EquipoMarinoDto> equipos = equipoMarinoService.buscarPorPrecioMayorA(precio);

            // Construir respuesta exitosa
            GenericResponseDto<List<EquipoMarinoDto>> respuesta = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(equipos)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<EquipoMarinoDto>> respuestaError = GenericResponseDto.<List<EquipoMarinoDto>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
