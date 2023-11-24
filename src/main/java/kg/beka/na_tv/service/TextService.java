package kg.beka.na_tv.service;

import kg.beka.na_tv.model.Text;
import kg.beka.na_tv.model.dto.TextDTO;

import java.util.List;

public interface TextService {
    TextDTO save(TextDTO textDTO);
    List<Text>findAll();
}
