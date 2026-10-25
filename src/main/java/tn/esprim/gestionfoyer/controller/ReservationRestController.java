
package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Reservation;
import tn.esprim.gestionfoyer.service.ReservationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {

    @Autowired
    private ReservationServiceImpl reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/retrieve-reservation/{reservationId}")
    public Reservation retrieveReservation(@PathVariable Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @DeleteMapping("/remove-reservation/{reservationId}")
    public void removeReservation(@PathVariable Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }
}
