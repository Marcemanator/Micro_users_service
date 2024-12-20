package com.MarcePruebas.users_service.Repository;



import com.MarcePruebas.users_service.DTO.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "posts-service")
public interface IPostApi {

    @GetMapping("/posts/{user_id}")
    public List<PostDTO> getByUserId(@PathVariable("user_id") Long user_id);
}
