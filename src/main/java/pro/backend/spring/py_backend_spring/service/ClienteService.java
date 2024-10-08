package pro.backend.spring.py_backend_spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.backend.spring.py_backend_spring.model.Cliente;
import pro.backend.spring.py_backend_spring.repository.ClienteRepository;
import pro.backend.spring.py_backend_spring.service.impl.IClienteService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findByNombre(String nombre) {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findByEmail(String email) {
        return clienteRepository.findAll();
    }
}
