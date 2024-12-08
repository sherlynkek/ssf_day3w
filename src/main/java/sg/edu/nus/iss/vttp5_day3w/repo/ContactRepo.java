package sg.edu.nus.iss.vttp5_day3w.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5_day3w.model.Contact;

@Repository
public class ContactRepo {
    
    private List<Contact> persons = new ArrayList<>();
    
    public List<Contact> getAllContacts() {
        return persons;
    }

}
