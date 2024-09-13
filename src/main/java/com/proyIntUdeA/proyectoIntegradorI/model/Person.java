package com.proyIntUdeA.proyectoIntegradorI.model;

public class Person {
    private String user_id;
    private String user_id_type;
    private String user_name;
    private String user_lastname;
    private String user_email;
    private String user_password;
    private String user_phone;
    private String user_department;
    private String user_city;
    private String user_state;
    private String user_role;

    public Person() {
    }

    public Person(String user_id, String user_id_type, String user_name, String user_lastname, String user_email,
            String user_password, String user_phone, String user_department, String user_city, String user_state,
            String user_role) {
        this.user_id = user_id;
        this.user_id_type = user_id_type;
        this.user_name = user_name;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_department = user_department;
        this.user_city = user_city;
        this.user_state = user_state;
        this.user_role = user_role;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id_type() {
        return user_id_type;
    }

    public void setUser_id_type(String user_id_type) {
        this.user_id_type = user_id_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_department() {
        return user_department;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

}
