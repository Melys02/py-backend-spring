package pro.backend.spring.py_backend_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.backend.spring.py_backend_spring.dto.GenericResponseDto;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.service.impl.IClienteService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cliente")

public class ClienteController {
    private final IClienteService clienteService;
    @GetMapping("/buscarPorNombre/{nombre}")
    public ResponseEntity<GenericResponseDto<List<Cliente>>> buscarPorNombre(@PathVariable String nombre) {
        try {
            // Llamada al servicio para buscar clientes por nombre
            List<Cliente> clientes = clienteService.findByNombre(nombre);

            // Construir respuesta exitosa
            GenericResponseDto<List<Cliente>> respuesta = GenericResponseDto.<List<Cliente>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(clientes)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<Cliente>> respuestaError = GenericResponseDto.<List<Cliente>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscarPorEmail/{email}")
    public ResponseEntity<GenericResponseDto<List<Cliente>>> buscarPorEmail(@PathVariable String email) {
        try {
            // Llamada al servicio para buscar clientes por email
            List<Cliente> clientes = clienteService.findByEmail(email);

            // Construir respuesta exitosa
            GenericResponseDto<List<Cliente>> respuesta = GenericResponseDto.<List<Cliente>>builder()
                    .correcto(true)
                    .mensaje("Consulta exitosa")
                    .respuesta(clientes)
                    .build();

            return new ResponseEntity<>(respuesta, HttpStatus.OK);

        } catch (Exception e) {
            // Construir respuesta en caso de error
            GenericResponseDto<List<Cliente>> respuestaError = GenericResponseDto.<List<Cliente>>builder()
                    .correcto(false)
                    .mensaje("Error al realizar la consulta")
                    .codigoError("500")
                    .build();

            return new ResponseEntity<>(respuestaError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        }
}
