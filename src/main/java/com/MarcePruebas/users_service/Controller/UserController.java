package com.MarcePruebas.users_service.Controller;

import com.MarcePruebas.users_service.DTO.UserDTO;
import com.MarcePruebas.users_service.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    public IUserService userServ;


    @GetMapping("/posts/{user_id}")

    public UserDTO getUserandPosts(@PathVariable Long user_id) {
        UserDTO user = userServ.getUserAndPost(user_id);

        return user;
    }
}
