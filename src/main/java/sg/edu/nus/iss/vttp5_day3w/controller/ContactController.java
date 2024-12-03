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
@RequestMapping("/contacts")
public class ContactController {
    
    @Autowired
    ContactService contactService;

    @GetMapping()
    public String contactListing(Model model) {
        List<Contact> contacts = contactService.findAll();
        model.addAttribute("contacts", contacts);
        return "contactlist";
    }

    

}
