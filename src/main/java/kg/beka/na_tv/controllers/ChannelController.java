package kg.beka.na_tv.controllers;
import kg.beka.na_tv.model.dto.ChannelDTO;
import kg.beka.na_tv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/channel")
@RequiredArgsConstructor
public class ChannelController {
    private  final ChannelService service;
    @PostMapping("/saveChannel")
    public ChannelDTO save(@RequestBody ChannelDTO channelDTO){
        return service.save(channelDTO);
    }
    @GetMapping("/findAll")
    public List<ChannelDTO>findAll(){
        return service.findAll();
    }
    @GetMapping("/findById")
    public ChannelDTO findById(Long id){
        ChannelDTO channelDTO=service.findBYId(id);
        return channelDTO;
    }
        }
