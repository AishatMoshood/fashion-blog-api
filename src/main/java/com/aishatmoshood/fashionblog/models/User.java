package com.aishatmoshood.fashionblog.models;

import com.aishatmoshood.fashionblog.enums.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(schema = "public")
public class User extends Person {
    private String gender;
    private UserType userType;


    @OneToMany(mappedBy ="user", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private List<Comment> comments;

    @OneToMany(mappedBy ="user", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private List<Like> likes;

}
