package pro.backend.spring.py_backend_spring.service.impl;

import pro.backend.spring.py_backend_spring.model.OrdenMantenimiento;

import java.util.List;

public interface IOrdenMantenimientoService {
    List<OrdenMantenimiento> findByEstado(String estado);
    List<OrdenMantenimiento> findByEquipoMarino_IdEquipo(Long idEquipo);
}
