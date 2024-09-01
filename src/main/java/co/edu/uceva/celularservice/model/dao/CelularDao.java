package co.edu.uceva.celularservice.model.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.uceva.celularservice.model.entities.Celular;

/**
 * Esta interfaz hereda de CrudRepository y se encarga de realizar las operaciones CRUD de la entidad Celular
 */

public interface CelularDao extends CrudRepository<Celular, Long> {
}
