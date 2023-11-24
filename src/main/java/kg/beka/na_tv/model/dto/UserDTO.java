package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class UserDTO {
    Long id;
    String name;
    String surname;
    String role;
    String phone;
    String email;
    String login;
    @JsonProperty("user_status")
    boolean userStatus;
}
