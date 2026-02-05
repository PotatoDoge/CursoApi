package com.cursoapi.servicio;

import com.cursoapi.model.Estudiante;
import com.cursoapi.repositorio.EstudianteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio {

    private final EstudianteRepositorio estudianteRepositorio;

    public EstudianteServicio(EstudianteRepositorio estudianteRepositorio){
        this.estudianteRepositorio = estudianteRepositorio;
    }

    public List<Estudiante> buscarTodos(){
        return  estudianteRepositorio.buscarTodos();
    }

}
