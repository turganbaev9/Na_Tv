package kg.beka.na_tv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name = "tb_text_add")
@RequiredArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    @JsonProperty("symbol_count")
    Integer symbolCount;

}
