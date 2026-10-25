
package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Universite;
import tn.esprim.gestionfoyer.service.UniversiteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {

    @Autowired
    private UniversiteServiceImpl universiteService;

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universiteId}")
    public Universite retrieveUniversite(@PathVariable Long universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @DeleteMapping("/remove-universite/{universiteId}")
    public void removeUniversite(@PathVariable Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite universite) {
        return universiteService.modifyUniversite(universite);
    }
}
