package com.Practice.PracticeProject.Controller;

import com.Practice.PracticeProject.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;


@Controller
public class UserController
{
    Login mylogin;

    @Autowired
    private UserDetailsService userDetailsService;

    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/error")
    public String error()
    {
        System.out.println("/error");
        return "error.html";
    }

    @GetMapping({"/", "/index"})
    public String showForm()
    {
        //model.addAttribute("user", userDTO);
        System.out.println("/index: GetMapping");
        return "index.html";
    }

    @PostMapping("/index")
    public String postForm()
    {
        System.out.println("POST: /index");
        return "home.html";
    }

    @GetMapping("/home")
    public String home(Model model, Principal principal) throws JsonProcessingException
    {

//        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//        model.addAttribute("userDetails", userDetails);
//        System.out.println("/home page");
//        System.out.println("Current User Data: " + userDetails.toString());

        //DataController redController = new DataController();
       // redController.patty(model, principal);
        return "home.html";

    }


}
