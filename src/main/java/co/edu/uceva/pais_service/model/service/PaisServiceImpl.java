package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.dao.IPaisDao;
import co.edu.uceva.pais_service.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta calse implementa el servicio de pao
 *un servicio
 *  */

@Service
public class PaisServiceImpl implements  IPaisService{

    @Autowired
    IPaisDao paisDao;
    @Override
    public Pais save(Pais pais) {

        return paisDao.save(pais);
    }

    @Override
    public void delete(Pais pais) {
        paisDao.delete(pais);

    }

    @Override
    public Pais update(Pais pais) {

        return paisDao.save(pais);
    }

    /**
     * Este metodo lista los paises guardados
     * @returnuna lista de pasies
     */
    @Override
    public List<Pais> findAll() {
        return (List<Pais>)paisDao.findAll();
    }

    @Override
    public Pais findById(Long id) {

        return (Pais) paisDao.findById(id).get();
    }
}
