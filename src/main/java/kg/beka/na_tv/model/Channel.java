package kg.beka.na_tv.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Setter
@Getter
@RequiredArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_channel")
public class Channel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
     Long id;
    @JsonProperty("channel_name")
     String channelName;
    @JsonProperty("created_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
     Date createdDate;
    @JsonProperty("channel_status")
    boolean channelStatus;

}
