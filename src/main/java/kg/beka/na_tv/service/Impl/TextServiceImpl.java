package kg.beka.na_tv.service.Impl;

import kg.beka.na_tv.mapper.TextMapper;
import kg.beka.na_tv.model.Text;
import kg.beka.na_tv.model.dto.TextDTO;
import kg.beka.na_tv.repository.TextRep;
import kg.beka.na_tv.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TextServiceImpl implements TextService {
    private  final TextRep textRep;
    @Override
    public TextDTO save(TextDTO textDTO) {
        Text text= TextMapper.INSTANCE.toEntity(textDTO);
       int symbolCount=textDTO.getText().replaceAll("[^a-zA-Zа-яА-Я]","").length();
        text.setSymbolCount(symbolCount);
        textRep.save(text);

        return TextMapper.INSTANCE.toDTO(text);
    }

    @Override
    public List<Text> findAll() {
        return textRep.findAll();
    }
}
