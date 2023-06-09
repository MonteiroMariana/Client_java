package com.fatec.client.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;
import com.fatec.client.services.ClientSerivice;

@RestController
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientSerivice clientSerivice;

    @GetMapping("clients/{id}")
    public Client getClient(@PathVariable int id){
    return clientSerivice.getClientById(id);    
         
    }

 @GetMapping("clients")
 public List<Client> getClients(){
return clientSerivice.getClients();
}

}

