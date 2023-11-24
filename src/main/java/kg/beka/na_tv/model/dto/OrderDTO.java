package kg.beka.na_tv.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.beka.na_tv.model.Channel;
import kg.beka.na_tv.model.Enum.Status;
import kg.beka.na_tv.model.Price;
import kg.beka.na_tv.model.Text;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Data
public class OrderDTO {
    Long id;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("full_name_client")
    String fullNameClient;
    @JsonProperty("client_phone")
    String clientPhone;
    @JsonProperty("order_sum")
    Double priceBeforeDiscount;
    Double priceWithDiscount;
    Double totalSum;
    @Enumerated(EnumType.STRING)
    Status status;

    @JoinColumn(name = "channel_id")
    ChannelDTO channel;
    @JoinColumn(name = "text_id")
    TextDTO text;
    @JoinColumn(name = "price_id")
    PriceDTO price;
}
