package kg.beka.na_tv.mapper;

import kg.beka.na_tv.model.Channel;
import kg.beka.na_tv.model.dto.ChannelDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChannelMapper {
ChannelMapper INSTANCE= Mappers.getMapper(ChannelMapper.class);
ChannelDTO toDTO(Channel channel);
Channel toEntity(ChannelDTO channelDTO);
List<ChannelDTO>toDTOList(List<Channel>channelList);
List<Channel>toEntityList(List<ChannelDTO>channels);

}
