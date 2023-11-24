package kg.beka.na_tv.mapper;

import kg.beka.na_tv.model.Text;
import kg.beka.na_tv.model.dto.TextDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TextMapper {
TextMapper INSTANCE= Mappers.getMapper(TextMapper.class);
TextDTO toDTO(Text text);
Text toEntity(TextDTO textDTO);
List<TextDTO>toDTOList(List<Text>texts);
List<Text>toEntityList(List<TextDTO>textDTOS);

}
