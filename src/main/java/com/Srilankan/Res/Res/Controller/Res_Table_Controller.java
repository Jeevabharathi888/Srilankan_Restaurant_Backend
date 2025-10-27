package com.Srilankan.Res.Res.Controller;

import com.Srilankan.Res.Res.Service.Res_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://your-project-name.vercel.app")
@RequestMapping("/api")
public class Res_Table_Controller {

    @Autowired
    private Res_Service res_service;

    @PostMapping("/reserve")
    public String reserve(
            @RequestParam("name") String name,
            @RequestParam("mail") String mail,
            @RequestParam("number") String number,
            @RequestParam("number_guest") String number_guest,
            @RequestParam("date") String date) {

        res_service.reserve(name, mail, number, number_guest, date);
        return "Congratulations " + name + ", your table for " + number_guest + " guests was booked!";
    }
}

