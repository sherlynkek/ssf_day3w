package sg.edu.nus.iss.vttp5_day3w.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5_day3w.model.Contact;
import sg.edu.nus.iss.vttp5_day3w.repo.ContactRepo;

@Service
public class ContactService {

    @Autowired
    ContactRepo contactRepo;
    
    public List<Contact> getAllContacts() {
        return contactRepo.getAllContacts();
    }

    


    
}
