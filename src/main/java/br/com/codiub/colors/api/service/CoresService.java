package br.com.codiub.colors.api.service;

import br.com.codiub.colors.model.entity.Cores;
import br.com.codiub.colors.model.input.CoresInput;
import br.com.codiub.colors.repository.CoresRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoresService{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private final CoresRepository coresRepository;

    public Cores save(CoresInput coresInput) {
        Cores cores = modelMapper.map(coresInput, Cores.class);
        return coresRepository.save(cores);
    }

    public List<Cores> listAll() {
        return coresRepository.findAll();
    }

    public Cores findById(Long id) {
        return coresRepository.findById(id).orElseThrow(() -> new RuntimeException("Cor não encontrada"));
    }

    public Cores updateById(Long id, CoresInput coresInput) {
        Cores cores = findById(id);
        cores.setCor(coresInput.getCor());
        cores.setTipo(coresInput.getTipo());
        return coresRepository.save(cores);
    }


}
