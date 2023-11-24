package kg.beka.na_tv.service.Impl;

import kg.beka.na_tv.mapper.UserMapper;
import kg.beka.na_tv.model.User;
import kg.beka.na_tv.model.dto.UserDTO;
import kg.beka.na_tv.repository.UserRep;
import kg.beka.na_tv.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private  final UserRep userRep;
    @Override
    public UserDTO save(UserDTO userDTO) {
        User user= UserMapper.INSTANCE.toEntity(userDTO);
        userRep.save(user);
        return UserMapper.INSTANCE.toDTO(user);
    }

    @Override
    public List<User> findAll() {
        return userRep.findAll();
    }
}
