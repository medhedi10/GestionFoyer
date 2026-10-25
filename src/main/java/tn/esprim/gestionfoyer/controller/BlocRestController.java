
package tn.esprim.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Bloc;
import tn.esprim.gestionfoyer.service.BlocServiceImpl;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/bloc")
public class BlocRestController {

    @Autowired
    private BlocServiceImpl blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve-bloc/{blocId}")
    public Bloc retrieveBloc(@PathVariable Long blocId) {
        return blocService.retrieveBloc(blocId);
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @DeleteMapping("/remove-bloc/{blocId}")
    public void removeBloc(@PathVariable Long blocId) {
        blocService.removeBloc(blocId);
    }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc bloc) {
        return blocService.modifyBloc(bloc);
    }
}
