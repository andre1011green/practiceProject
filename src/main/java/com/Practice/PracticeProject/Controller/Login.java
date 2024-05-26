package com.Practice.PracticeProject.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.security.Principal;


public class Login
{
    Authentication currentUser;

    @Autowired
    private UserDetailsService userDetailsService;


    private Principal principal;


    public String loggInUser(@ModelAttribute("userDetails") UserDetails userDetails, Model model, Principal principal) throws JsonProcessingException
    {
        this.principal = principal;
        currentUser = SecurityContextHolder.getContext().getAuthentication();

        userDetails = userDetailsService.loadUserByUsername(principal.getName());

        if (currentUser != null)
        {
            System.out.println("Andre the current user is " + currentUser.getName());
            return principal.getName();
        }
        else
        {
            System.out.println("No current user");
            return "No Current User";
        }

    }

    public String displayAllOfMyTickets() throws JsonProcessingException
    {
        // UserDetails userDetails = userDetailsManager.loadUserByUsername(currentUser.getName());

        return "xx";
    }

}
