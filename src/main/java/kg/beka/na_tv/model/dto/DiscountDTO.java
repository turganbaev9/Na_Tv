package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.beka.na_tv.model.Channel;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class DiscountDTO {
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
    ChannelDTO channel;}
