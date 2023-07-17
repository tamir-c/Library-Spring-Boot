package com.example.Library.model;

import java.util.Date;

public class Member {
    private int member_id;
    private String name;
    private String phone_num;

    private String email;

    private Date date_joined;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Date date_joined) {
        this.date_joined = date_joined;
    }

    @Override
    public String toString() {
        return "Member ID: " + member_id + ", Name: " + name + ", Phone Number: " + phone_num + ", Email: " + email + ", Date Joined: " + date_joined;
    }
}
