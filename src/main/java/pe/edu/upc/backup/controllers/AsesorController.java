package pe.edu.upc.backup.controllers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.AdministradorDTO;
import pe.edu.upc.backup.dtos.AsesorDTO;
import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.services.IAsesorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asesores")
public class AsesorController {
    @Autowired
    private IAsesorService aS;
    @PostMapping
    public void insert(@RequestBody AsesorDTO dto){
        ModelMapper m=new ModelMapper();
        Asesor a=m.map(dto, Asesor.class);
        aS.insert(a);
    }
    @GetMapping
    public List<AsesorDTO> List(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, AsesorDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public AsesorDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        AsesorDTO dto=m.map(aS.listId(id),AsesorDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody AsesorDTO dto){
        ModelMapper m=new ModelMapper();
        Asesor a=m.map(dto, Asesor.class);
        aS.insert(a);
    }
}
