package kg.beka.na_tv.mapper;

import kg.beka.na_tv.model.Order;
import kg.beka.na_tv.model.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);
OrderDTO toDTO(Order order);
Order toEntity(OrderDTO orderDTO);
List<OrderDTO>toDtoList(List<Order>orders );
List<Order>toEntityList(List<OrderDTO>ordersDtos);
}
