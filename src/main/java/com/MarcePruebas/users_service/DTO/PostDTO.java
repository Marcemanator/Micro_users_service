package com.MarcePruebas.users_service.DTO;


import lombok.*;

//@Getter@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class PostDTO {

    private Long id;
    private String title;
    private Long user_id;

    public PostDTO() {
    }

    public PostDTO(Long id, String title, Long user_id) {
        this.id = id;
        this.title = title;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
