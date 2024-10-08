package pro.backend.spring.py_backend_spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.backend.spring.py_backend_spring.dto.EquipoMarinoDto;
import pro.backend.spring.py_backend_spring.model.EquipoMarino;
import pro.backend.spring.py_backend_spring.repository.EquipoMarinoRepository;
import pro.backend.spring.py_backend_spring.service.impl.IClienteService;
import pro.backend.spring.py_backend_spring.service.impl.IEquipoMarinoService;
import pro.backend.spring.py_backend_spring.util.EquipoMarinoConvert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipoMarinoService implements IEquipoMarinoService {

    private final EquipoMarinoRepository equipoMarinoRepository;
    private final EquipoMarinoConvert equipoMarinoConvert;


    @Override
    public List<EquipoMarinoDto> buscarPorTipo(String tipo) {
        List<EquipoMarinoDto> equipoMarinoDtos = new ArrayList<>();
        for (EquipoMarinoDto equipoMarino : equipoMarinoRepository.buscarPorTipo(tipo)) {
            equipoMarinoDtos.add(equipoMarinoConvert.convertirEquipoMarinoAEquipoMarinoDto(equipoMarino)); // Asegúrate de usar este método
        }
        return equipoMarinoDtos;
    }


    @Override
    public List<EquipoMarinoDto> buscarPorEstado(String estado) {
        List<EquipoMarinoDto> equipoMarinoDtos = new ArrayList<>();
        for (EquipoMarinoDto equipoMarino : equipoMarinoRepository.buscarPorEstado(estado)) {
            equipoMarinoDtos.add(equipoMarinoConvert.convertirEquipoMarinoAEquipoMarinoDto(equipoMarino)); // Asegúrate de usar este método
        }
        return equipoMarinoDtos;
    }

    @Override
    public List<EquipoMarinoDto> buscarPorFabricante(String fabricante) {
        List<EquipoMarinoDto> equipoMarinoDtos = new ArrayList<>();
        for (EquipoMarinoDto equipoMarino : equipoMarinoRepository.buscarPorFabricante(fabricante)) {
            equipoMarinoDtos.add(equipoMarinoConvert.convertirEquipoMarinoAEquipoMarinoDto(equipoMarino)); // Asegúrate de usar este método
        }
        return equipoMarinoDtos;
    }

    @Override
    public List<EquipoMarinoDto> buscarPorPrecioMayorA(BigDecimal precio) {
        List<EquipoMarinoDto> equipoMarinoDtos = new ArrayList<>();
        for (EquipoMarinoDto equipoMarino : equipoMarinoRepository.buscarPorPrecioMayorA(precio)) {
            equipoMarinoDtos.add(equipoMarinoConvert.convertirEquipoMarinoAEquipoMarinoDto(equipoMarino)); // Asegúrate de usar este método
        }
        return equipoMarinoDtos;
    }
}
