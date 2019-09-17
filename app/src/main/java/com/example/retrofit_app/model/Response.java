package com.example.retrofit_app.model;

import java.util.List;

public class Response extends User {
    private List<User> users;
    private List<Address> addresses;

    public Response(List<User> users, List<Address> addresses) {
        this.users = users;
        this.addresses = addresses;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
