package michal.hotelsapplication.data.entity.reservationroom;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ReservationRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "reservation_id")
    private Integer reservation_id;

    @Column(name = "room_id")
    private Integer room_id;
}
