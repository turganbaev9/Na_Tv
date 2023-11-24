package kg.beka.na_tv.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "tb_price")
public class Price {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@JsonProperty("price_per_simbol")
    Double pricePerSimbol;
Double price;
@JsonProperty("start_date")
@JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
@JsonProperty("end_date")
        @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
@ManyToOne
    @JoinColumn(name = "text")
Text text;
@ManyToOne
    @JoinColumn(name = "discount")
    Discount discount;
}
