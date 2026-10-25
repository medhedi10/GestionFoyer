package tn.esprim.gestionfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite retrieveUniversite(Long universiteId);

    Universite addUniversite(Universite u);

    void removeUniversite(Long universiteId);

    Universite modifyUniversite(Universite universite);
}

