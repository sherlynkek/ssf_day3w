package sg.edu.nus.iss.vttp5_day3w.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5_day3w.model.Contact;
import sg.edu.nus.iss.vttp5_day3w.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {
    
    @Autowired
    ContactService contactService;

    @GetMapping()
    public String getAllPersons(Model model){
        List<Contact> persons = contactService.getAllContacts();
        model.addAttribute("persons", persons);

        return "contactList";
    }

    
}