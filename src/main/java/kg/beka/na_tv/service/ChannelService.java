package kg.beka.na_tv.service;

import kg.beka.na_tv.model.dto.ChannelDTO;

import java.util.List;

public interface ChannelService {
    ChannelDTO save(ChannelDTO channelDTO);
    ChannelDTO findBYId(Long id);
    List<ChannelDTO>findAll();
}
