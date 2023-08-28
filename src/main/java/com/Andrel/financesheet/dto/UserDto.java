package com.Andrel.financesheet.dto;


import java.util.Objects;

public class UserDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private Boolean isActive=true;


    public UserDto() {
    }

    public UserDto(Long id, String name, String surname, String email, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto UserDto = (UserDto) o;
        return id.equals(UserDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
