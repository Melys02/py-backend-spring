package pro.backend.spring.py_backend_spring.service.impl;

import pro.backend.spring.py_backend_spring.model.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByEmail(String email);
}
