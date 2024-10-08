package pro.backend.spring.py_backend_spring.util;

import pro.backend.spring.py_backend_spring.dto.EquipoMarinoDto;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;

public class EquipoMarinoConvert {

    public EquipoMarinoDto equipoMarinoDto(EquipoMarino equipoMarino) {
        return EquipoMarinoDto.builder()
                .nombre(equipoMarino.getNombre())
                .tipo(equipoMarino.getTipo())
                .precio(equipoMarino.getPrecio())
                .build();
    }


    public EquipoMarinoDto convertirEquipoMarinoAEquipoMarinoDto(EquipoMarinoDto equipoMarino) {
        return EquipoMarinoDto.builder()
                .id_equipo(equipoMarino.getId_equipo()) // Cambia a equipoMarino
                .nombre(equipoMarino.getNombre())
                .tipo(equipoMarino.getTipo())
                .fabricante(equipoMarino.getFabricante())
                .precio(equipoMarino.getPrecio())
                .estado(equipoMarino.getEstado())
                .build();
    }




}
