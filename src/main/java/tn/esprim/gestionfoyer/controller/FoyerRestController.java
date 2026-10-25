
package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Foyer;
import tn.esprim.gestionfoyer.service.FoyerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {

    @Autowired
    private FoyerServiceImpl foyerService;

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/retrieve-foyer/{foyerId}")
    public Foyer retrieveFoyer(@PathVariable Long foyerId) {
        return foyerService.retrieveFoyer(foyerId);
    }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @DeleteMapping("/remove-foyer/{foyerId}")
    public void removeFoyer(@PathVariable Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifyFoyer(foyer);
    }
}
