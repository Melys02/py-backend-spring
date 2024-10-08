package pro.backend.spring.py_backend_spring.service;

import pro.backend.spring.py_backend_spring.model.OrdenMantenimiento;
import pro.backend.spring.py_backend_spring.service.impl.IOrdenMantenimientoService;

import java.util.List;

public class OrdenMantenimientoService implements IOrdenMantenimientoService {
    @Override
    public List<OrdenMantenimiento> findByEstado(String estado) {
        return List.of();
    }

    @Override
    public List<OrdenMantenimiento> findByEquipoMarino_IdEquipo(Long idEquipo) {
        return List.of();
    }
}
