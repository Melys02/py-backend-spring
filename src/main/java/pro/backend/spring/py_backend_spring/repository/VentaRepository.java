package pro.backend.spring.py_backend_spring.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.model.Venta;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository

public interface VentaRepository extends JpaRepository<Venta, String> {

    @Query("SELECT v FROM Venta v WHERE v.cliente.idCliente = :idCliente")
    List<Venta> buscarPorCliente(@Param("idCliente") Long idCliente);

    @Query("SELECT v FROM Venta v WHERE v.fechaVenta BETWEEN :fechaInicio AND :fechaFin")
    List<Venta> buscarPorRangoDeFechas(@Param("fechaInicio") LocalDate fechaInicio);

    @Transactional
    @Modifying
    @Query(value = "UPDATE Venta v SET v.montoTotal = :montoTotal WHERE v.idVenta = :idVenta")
    void actualizarMontoTotal(@Param("montoTotal") BigDecimal montoTotal, @Param("idVenta") Long idVenta);
}
