package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.model.Proveedor;
@Repository

public interface ProveedorRepository extends JpaRepository<Proveedor, String> {



}
