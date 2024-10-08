package pro.backend.spring.py_backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.backend.spring.py_backend_spring.model.Cliente;

import java.util.List;
import java.util.Optional;
@Repository

public interface ClienteRepository extends JpaRepository<Cliente, String> {


    List<Cliente> findByNombre(String nombre);

    Optional<Cliente> findByEmail(String email);

}
