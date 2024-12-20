package com.MarcePruebas.users_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//@Getter@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class UserDTO {

    private Long user_id;
    private String name;
    private String lastName;
    private String cellphone;
    private List<PostDTO> postList;

    public UserDTO() {
    }

    public UserDTO(Long user_id, String name, String lastName, String cellphone, List<PostDTO> postList) {
        this.user_id = user_id;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.postList = postList;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<PostDTO> getPostList() {
        return postList;
    }

    public void setPostList(List<PostDTO> postList) {
        this.postList = postList;
    }
}