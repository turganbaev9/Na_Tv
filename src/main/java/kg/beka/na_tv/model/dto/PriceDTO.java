package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.beka.na_tv.model.Text;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Setter
@Getter
public class PriceDTO {
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
    @JsonProperty("text")
    TextDTO textDTO;
    @JsonProperty("discount")
    DiscountDTO discountDTO;

}
