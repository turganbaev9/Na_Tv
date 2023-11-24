package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ChannelDTO {
    Long id;
    @JsonProperty("channel_name")
    String channelName;
    @JsonProperty("created_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date createdDate;
    @JsonProperty("channel_status")
    boolean channelStatus;


}
