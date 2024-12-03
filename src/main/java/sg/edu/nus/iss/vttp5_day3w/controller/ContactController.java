package sg.edu.nus.iss.vttp5_day3w.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import sg.edu.nus.iss.vttp5_day3w.model.Contact;
import sg.edu.nus.iss.vttp5_day3w.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/contact")
public class ContactController {
    
    @Autowired
    ContactService contactService;

    @GetMapping("")
    public String displayContacts(Model model) {
        model.addAttribute("contacts", contactService.getAll());
        return "contacts";
    }

    @GetMapping("/add")
    public String createForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact-create";
    }
    
    @PostMapping("/add")
    public String createContact(@Valid @ModelAttribute Contact contact, BindingResult binding, Model model) {
        if (binding.hasErrors()) {
            System.out.println(binding.getAllErrors());
            return "contact-create";
        }
        Contact tmp = new Contact(contact.getName(), contact.getEmail(), contact.getPhoneNum(), contact.getDob());
        contactService.add(tmp);
        return "redirect:/contact";
    }
    
    @GetMapping("/{id}")
    public String indivContactDetails(@PathVariable("id") String id, Model model) {
        Optional<Contact> contact = contactService.findContactById(id);
        model.addAttribute("contact", contact.get());
        return "contact-details";
    }
}
