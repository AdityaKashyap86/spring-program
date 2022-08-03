package com.sunglowsys.domain;

public class Employee {

    private  Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String address;

    public void getId() {
        System.out.println ("id :" + id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getFirstName() {
        System.out.println ("firstName :" + firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println ("lastName :"+ lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getEmail() {
        System.out.println ("email :" + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println ("mobile :" + mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void getAddress() {
        System.out.println ("address :" + address);
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
