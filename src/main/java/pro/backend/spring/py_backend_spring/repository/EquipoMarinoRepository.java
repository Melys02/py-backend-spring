package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.dto.EquipoMarinoDto;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

import java.math.BigDecimal;
import java.util.List;
@Repository

public interface EquipoMarinoRepository extends JpaRepository<EquipoMarino, String> {

    @Query("SELECT e FROM EquipoMarino e WHERE e.tipo = :tipo")
    List<EquipoMarinoDto> buscarPorTipo(@Param("tipo") String tipo);

    @Query("SELECT e FROM EquipoMarino e WHERE e.estado = :estado")
    List<EquipoMarinoDto> buscarPorEstado(@Param("estado") String estado);

    @Query(value = "SELECT * FROM equipo_marino WHERE fabricante = :fabricante", nativeQuery = true)
    List<EquipoMarinoDto> buscarPorFabricante(@Param("fabricante") String fabricante);

    @Query(value = "SELECT * FROM equipo_marino WHERE precio > :precio", nativeQuery = true)
    List<EquipoMarinoDto> buscarPorPrecioMayorA(@Param("precio") BigDecimal precio);

}
