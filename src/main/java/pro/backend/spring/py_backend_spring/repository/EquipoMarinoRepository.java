package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.util.List;
@Repository

public interface EquipoMarinoRepository extends JpaRepository<EquipoMarino, String> {

    @Query("SELECT e FROM EquipoMarino e WHERE e.tipo = :tipo")
    List<EquipoMarino> buscarPorTipo(@Param("tipo") String tipo);

    @Query("SELECT e FROM EquipoMarino e WHERE e.estado = :estado")
    List<EquipoMarino> buscarPorEstado(@Param("estado") String estado);



}
