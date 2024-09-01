package co.edu.uceva.celularservice.model.service;

import co.edu.uceva.celularservice.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar();
    void delete(Celular celular); //Elimina a celular de la base de datos
    Celular save(Celular celular); //Guarda a celular y me retorna un objeto de tipo Celular
    Celular findById(Long id); //Busca a celular por su id y me retorna un objeto de tipo Celular
    Celular update(Celular celular); //Actualiza a celular y me retorna un objeto de tipo Celular


}
