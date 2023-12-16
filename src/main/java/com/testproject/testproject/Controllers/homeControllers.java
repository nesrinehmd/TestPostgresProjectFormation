package com.testproject.testproject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.testproject.Entities.client;
import com.testproject.testproject.Services.clientService;

@RestController
public class homeControllers {

    @Autowired
    clientService clientService;

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello users";
    }

    @GetMapping("getClient")
    public List<client> getClient() {
        return clientService.getClient();
    }

    @PostMapping("addClient")
    public client saveClient(@RequestBody client client) {
        return clientService.saveClient(client);
    }

}
