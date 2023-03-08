package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.entities.Pais;

import java.util.List;

public interface IPaisService {
    public Pais save(Pais pais); //aca necesito que me retorne el pais para saber la primary key
    public void delete(Pais pais);// aca no necesito que me retorne algo
    public Pais update(Pais pais);
    public List<Pais> findAll();
    public Pais findById(Long id);//para buscar un pais por id
}
