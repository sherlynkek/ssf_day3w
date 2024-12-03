package sg.edu.nus.iss.vttp5_day3w.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class Contact {

    @NotEmpty(message = "Please enter your name")
    @Size(min = 2, max = 60, message = "Name must be between 2 to 60 characters")
    private String name;

    @Email(message = "Please enter a valid email")
    private String email;

    @Pattern(regexp = "(8|9)[0-9]{7}", message = "Phone number must start with 8 or 9 followed by 7 digits")
    private String phoneNum;

    @Past(message = "Birth Date must be a past date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    public Contact(String name, String email, String phoneNum, Date dob) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + "," + email + "," + phoneNum + "," + dob;
    } 

}
