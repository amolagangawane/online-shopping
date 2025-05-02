package com.online_shop.online_shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    private Integer id;
    private String name;
    private String email;

//    public UserDetails(Integer id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
