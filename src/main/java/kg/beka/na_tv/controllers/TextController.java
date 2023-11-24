package kg.beka.na_tv.controllers;

import kg.beka.na_tv.model.dto.TextDTO;
import kg.beka.na_tv.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/text")
public class TextController {
    private  final TextService textService;
    @PostMapping("/save")
    TextDTO save(@RequestBody TextDTO textDTO){
        return textService.save(textDTO);
    }
}
