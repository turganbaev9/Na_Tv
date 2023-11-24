package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class OrderDatesDTO {
    Long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date days;

}
