package com.practice.one.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
    private Long id;
    private String email;
    // @JsonIgnore
    // @JsonProperty(access = JsonProperty)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String pass;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
