package michal.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelCollectionDto {
    private List<HotelDto> hotels;

    public HotelCollectionDto() {
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public HotelCollectionDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
