package kg.beka.na_tv.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Table(name = "tb_order_dates")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date days;
    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;


}
