package sg.edu.nus.iss.vttp5_day3w.model;

import java.io.File;
import java.util.Date;
import java.util.Random;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import sg.edu.nus.iss.vttp5_day3w.util.Utility;


public class Contact {

    private String id;
    private File contactFile;

    @NotEmpty(message = "Please enter your name")
    @Size(min = 3, max = 64, message = "Name must be between 3 to 64 characters")
    private String name;

    @Email(message = "Please enter a valid email")
    private String email;

    @Pattern(regexp = "(8|9)[0-9]{7}", message = "Phone number must start with 8 or 9 followed by 7 digits")
    private String phoneNum;

    @Past(message = "Birth Date must be a past date")
    @Size(min = 10, max = 100, message = "Age must be between 10 to 100")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    public Contact(String name, String email, String phoneNum, Date dob) {
        Random random = new Random();
        int randomInt = random.nextInt();
        this.id += Integer.toHexString(randomInt);
        this.contactFile = new File(".\\" + Utility.dataDir + File.separator + this.id + ".txt");
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.dob = dob;
    }

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public File getContactFile() {
        return contactFile;
    }

    public void setContactFile(File contactFile) {
        this.contactFile = contactFile;
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
        return id + "," + name + "," + email + "," + phoneNum + "," + dob;
    }

}
