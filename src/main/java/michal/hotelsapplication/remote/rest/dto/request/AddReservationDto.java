package michal.hotelsapplication.remote.rest.dto.request;

import michal.hotelsapplication.remote.rest.dto.common.PersonReservationDto;
import michal.hotelsapplication.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

    public AddReservationDto(List<RoomReservationDto> hotels, PersonReservationDto person) {
        this.hotels = hotels;
        this.person = person;
    }
}
