package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.backend.spring.py_backend_spring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
