package michal.hotelsapplication.data.entity.reservation;

import michal.hotelsapplication.data.entity.reservationroom.ReservationRoomEntity;
import michal.hotelsapplication.domain.model.ReservationStatusType;

import javax.persistence.*;
import java.util.Set;

public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="status")
    private ReservationStatusType status;

    @Column(name ="name")
    private String name;

    @Column(name ="address")
    private String address;

    @Column(name ="phone")
    private String phone;

    @Column(name ="floor")
    private Integer floor;


    @Column(name ="token")
    private String token;

    @OneToMany(mappedBy = "reservation")
    private Set<ReservationRoomEntity> orderSize;
}
