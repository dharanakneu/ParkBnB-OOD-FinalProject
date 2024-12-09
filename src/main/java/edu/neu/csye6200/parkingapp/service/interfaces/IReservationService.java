package edu.neu.csye6200.parkingapp.service.interfaces;

import edu.neu.csye6200.parkingapp.dto.ReservationDTO;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    public List<ReservationDTO> getReservationsByRenteeId(Long renteeId);
    public ReservationDTO saveReservation(@Valid ReservationDTO reservationDTO, BindingResult bindingResult);
    Optional<ReservationDTO> getReservationById(Long id);
}
