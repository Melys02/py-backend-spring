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


    public EquipoMarino convertirEquipoMarinoDtoAEquipoMarino(EquipoMarinoDto equipoMarinoDto) {
        EquipoMarino equipoMarino = new EquipoMarino();
        equipoMarino.setNombre(equipoMarinoDto.getNombre());
        equipoMarino.setTipo(equipoMarinoDto.getTipo());
        equipoMarino.setPrecio(equipoMarinoDto.getPrecio());
        return equipoMarino;
    }

}
