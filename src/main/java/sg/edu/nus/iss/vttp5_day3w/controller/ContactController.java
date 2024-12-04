package sg.edu.nus.iss.vttp5_day3w.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import sg.edu.nus.iss.vttp5_day3w.model.Contact;
import sg.edu.nus.iss.vttp5_day3w.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;

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