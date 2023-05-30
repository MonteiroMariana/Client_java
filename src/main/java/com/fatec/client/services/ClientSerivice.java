package com.fatec.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.client.entities.Client;
import com.fatec.client.entities.repositories.ClientRepository;

@Service
public class ClientSerivice {

    @Autowired
private ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public Client getClientById(int id) {
        return null;
    }

}
