package co.edu.uceva.celularservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * La clase Celular es una entidad que se mapea con la tabla celular en la base de datos.
 * tiene id, marca, modelo, almacenamiento, ram y precio
 */



@Data
@Entity
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int precio;
}
