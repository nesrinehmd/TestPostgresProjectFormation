package com.testproject.testproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.testproject.Entities.client;
import com.testproject.testproject.Repositories.clientRepository;

@Service
public class clientService {

    @Autowired
    clientRepository clientRepository;

    public clientService() {

    }

    public List<client> getClient() {
        return clientRepository.findAll();
    }

    public client saveClient(client client) {
        return clientRepository.save(client);
    }

}
