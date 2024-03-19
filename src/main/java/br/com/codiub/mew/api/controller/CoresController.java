package br.com.codiub.mew.api.controller;


import br.com.codiub.mew.api.service.CoresService;
import br.com.codiub.mew.model.entity.Cores;
import br.com.codiub.mew.model.input.CoresInput;
import br.com.codiub.mew.model.output.CoresOutput;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cores")
public class CoresController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private final CoresService coresService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody CoresInput coresInput) {
        Cores createdUser = coresService.save(coresInput);
        CoresOutput coresOutput = new CoresOutput(createdUser);
        return ResponseEntity.ok(coresOutput);
    }

    @GetMapping
    public ResponseEntity<List<CoresOutput>> listAll() {
        List<Cores> coress = coresService.listAll();
        List<CoresOutput> responseDTOS = coress.stream()
                .map(CoresOutput::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responseDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CoresOutput> getById(@PathVariable Long id) {
        Cores cores = coresService.findById(id);
        CoresOutput coresOutput = new CoresOutput(cores);
        return ResponseEntity.ok(coresOutput);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody @Valid CoresInput coresInput) {
        Cores updatedUser = coresService.updateById(id, coresInput);

        CoresOutput coresOutput = new CoresOutput(updatedUser);
        return ResponseEntity.ok(coresOutput);

    }

}
