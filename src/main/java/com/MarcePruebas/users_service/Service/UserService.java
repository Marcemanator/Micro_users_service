package com.MarcePruebas.users_service.Service;


import com.MarcePruebas.users_service.DTO.PostDTO;
import com.MarcePruebas.users_service.DTO.UserDTO;
import com.MarcePruebas.users_service.Model.User;
import com.MarcePruebas.users_service.Repository.IPostApi;
import com.MarcePruebas.users_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private IPostApi PostApi;

    @Override
    public UserDTO getUserAndPost(Long user_id) {

        User us = new User();
        us = userRepo.findById(user_id).orElse(null);
        List<PostDTO> listapost = new ArrayList<>();
        listapost = PostApi.getByUserId(user_id);
        UserDTO userdto = new UserDTO();

        userdto.setUser_id(us.getUser_id());
        userdto.setName(us.getName());
        userdto.setLastName(us.getLastName());
        userdto.setCellphone(us.getCellphone());
        userdto.setPostList(listapost);


        return userdto;
    }

}