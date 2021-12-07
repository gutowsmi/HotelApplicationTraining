package michal.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class ReservationStatusDto {
    private List<ReservationDto> reservations;

    public ReservationStatusDto() {
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public ReservationStatusDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
