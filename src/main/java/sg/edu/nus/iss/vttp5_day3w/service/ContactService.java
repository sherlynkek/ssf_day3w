package sg.edu.nus.iss.vttp5_day3w.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5_day3w.model.Contact;

@Service
public class ContactService {

    @Autowired
    ContactRepo contactRepo;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAll() {
        return contactRepository.getAll();
    }

    public void add(Contact c) {
        contactRepository.add(c);
    }

    public Optional<Contact> findContactById(String id) {
        return contactRepository.findContactById(id);
    }
    
}
