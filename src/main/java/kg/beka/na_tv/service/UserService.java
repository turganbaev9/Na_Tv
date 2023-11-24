package kg.beka.na_tv.service;

import kg.beka.na_tv.model.User;
import kg.beka.na_tv.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);
List<User>findAll();
}
