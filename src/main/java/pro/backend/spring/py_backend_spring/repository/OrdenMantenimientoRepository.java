package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.model.OrdenMantenimiento;

import java.util.List;
@Repository

public interface OrdenMantenimientoRepository extends JpaRepository<OrdenMantenimiento, String> {

    List<OrdenMantenimiento> findByEstado(String estado);
    List<OrdenMantenimiento> findByEquipoMarino_IdEquipo(Long idEquipo);



}
