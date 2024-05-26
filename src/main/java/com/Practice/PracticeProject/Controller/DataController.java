package com.Practice.PracticeProject.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


public class DataController
{
    @Autowired
    Login mylogin;

    @Autowired
    Login myUserData;

    public DataController()
    {
        mylogin = new Login();
    }

    private UserDetails userDetails;


    @GetMapping("/loggInUser")
    public String patty(Model model, Principal principal) throws JsonProcessingException
    {
        System.out.println("Created dummy loggInUser page");
        return mylogin.loggInUser(userDetails, model, principal);
    }

    @GetMapping("/displayAllOfMyTickets")
    public String lucy() throws JsonProcessingException
    {
        System.out.println("Created dummy page for user data");
        return myUserData.displayAllOfMyTickets();
    }

}
