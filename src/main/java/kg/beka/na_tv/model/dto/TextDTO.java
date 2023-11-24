package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Setter
@Getter
public class TextDTO {
    Long id;
    String text;
    @JsonProperty("symbol_count")
    Integer symbolCount;

}
