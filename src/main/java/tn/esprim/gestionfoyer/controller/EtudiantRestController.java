
package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Etudiant;
import tn.esprim.gestionfoyer.service.EtudiantServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {

    @Autowired
    private EtudiantServiceImpl etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve-etudiant/{etudiantId}")
    public Etudiant retrieveEtudiant(@PathVariable Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/remove-etudiant/{etudiantId}")
    public void removeEtudiant(@PathVariable Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.modifyEtudiant(etudiant);
    }
}
