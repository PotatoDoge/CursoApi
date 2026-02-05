package com.cursoapi.controlador;

import com.cursoapi.model.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    @GetMapping
    public String getEstudiante(){
        return "Hola estudiantes";
    }

    @PostMapping
    public ResponseEntity<Estudiante> postEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudiante, HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula){
        return "Hola estudiante eliminado";
    }
}
