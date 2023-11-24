package kg.beka.na_tv.controllers;

import kg.beka.na_tv.model.dto.UserDTO;
import kg.beka.na_tv.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
private  final UserService userService;
@PostMapping("/save")
    UserDTO save(@RequestBody UserDTO userDTO){
    return userService.save(userDTO);
}
}
