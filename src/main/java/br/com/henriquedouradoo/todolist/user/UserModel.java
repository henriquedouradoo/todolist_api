package br.com.henriquedouradoo.todolist.user;

import lombok.Data;

// Getters e Setters usando o lombok
@Data
public class UserModel {
    
    private String name;
    private String username;
    private String password;

}
