package pro.backend.spring.py_backend_spring.service.impl;

import pro.backend.spring.py_backend_spring.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    List<Cliente> findByNombre(String nombre);
    Optional<Cliente> findByEmail(String email);
}
