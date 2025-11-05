package com.example.SMS.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data

public class StudentDto {
    private long Roll_No;

    @JsonProperty("First_name")
    private String First_name;
    @JsonProperty("Last_name")
    private String Last_name;
    @JsonProperty("Address")
    private String Address;
    @JsonProperty("DOB")
    private  String DOB;
    @JsonProperty("Gender")
    private String Gender;
    @JsonProperty("Email_id")
    private String Email_id;
    @JsonProperty("Mob_no")
    private String Mob_no;
    @JsonProperty("Enrollment_date")
    private String Enrollment_date;

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }

    public String getMob_no() {
        return Mob_no;
    }

    public void setMob_no(String mob_no) {
        Mob_no = mob_no;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEnrollment_date() {
        return Enrollment_date;
    }

    public void setEnrollment_date(String enrollment_date) {
        Enrollment_date = enrollment_date;
    }

}
