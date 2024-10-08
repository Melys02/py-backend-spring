package pro.backend.spring.py_backend_spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

    @Getter
    @Setter
    @Entity
    @Table(name = "EquipoMarino")
    public class EquipoMarino {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id_equipo;
        //@Column(name = "")
        private String nombre;
        private String tipo;
        private String fabricante;
        private BigDecimal precio;
        private String estado;
    }

