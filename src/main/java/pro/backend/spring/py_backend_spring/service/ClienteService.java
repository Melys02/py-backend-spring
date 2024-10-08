package pro.backend.spring.py_backend_spring.service;

import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.service.impl.IClienteService;

import java.util.List;
import java.util.Optional;

public class ClienteService implements IClienteService {

    @Override
    public List<Cliente> findByNombre(String nombre) {
        return List.of();
    }

    @Override
    public Optional<Cliente> findByEmail(String email) {
        return Optional.empty();
    }
}
