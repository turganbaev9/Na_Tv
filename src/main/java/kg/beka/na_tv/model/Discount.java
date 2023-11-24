package kg.beka.na_tv.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Table(name = "tb_discount")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double discount;
    @JsonProperty("start_date")
            @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
    @JsonProperty("discount_days")
    Integer discountDays;
    @ManyToOne

    @JoinColumn(name = "channel_id")
    Channel channel;
}
