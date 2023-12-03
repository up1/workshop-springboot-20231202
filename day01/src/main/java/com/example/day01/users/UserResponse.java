package com.example.day01.users;

import java.util.Objects;

public class UserResponse {

    private int id;
    private String first_name;
    private String last_name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse response = (UserResponse) o;
        return id == response.id && age == response.age && Objects.equals(first_name, response.first_name) && Objects.equals(last_name, response.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
