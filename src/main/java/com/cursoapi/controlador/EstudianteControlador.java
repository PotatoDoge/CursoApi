package com.cursoapi.controlador;

import com.cursoapi.model.Estudiante;
import com.cursoapi.servicio.EstudianteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteServicio estudianteServicio;

    public EstudianteControlador(EstudianteServicio estudianteServicio){
        this.estudianteServicio = estudianteServicio;
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        return new ResponseEntity<>(estudianteServicio.buscarTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estudiante> postEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudiante, HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula){
        return "Hola estudiante eliminado";
    }

    @PutMapping("{matricula}")
    public String actualiarEstudiante(@PathVariable String matricula, @RequestBody Estudiante estudiante){
        return "Hola estudiante actualizado";
    }
}
