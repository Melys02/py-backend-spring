package pro.backend.spring.py_backend_spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.backend.spring.py_backend_spring.model.OrdenMantenimiento;
import pro.backend.spring.py_backend_spring.repository.OrdenMantenimientoRepository;
import pro.backend.spring.py_backend_spring.service.impl.IOrdenMantenimientoService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdenMantenimientoService implements IOrdenMantenimientoService {

    private final OrdenMantenimientoRepository ordenMantenimientoRepository;

    @Override
    public List<OrdenMantenimiento> findByEstado(String estado) {
        return ordenMantenimientoRepository.findAll();
    }

    @Override
    public List<OrdenMantenimiento> findByEquipoMarino_IdEquipo(Long idEquipo) {
        return ordenMantenimientoRepository.findAll();
    }
}
