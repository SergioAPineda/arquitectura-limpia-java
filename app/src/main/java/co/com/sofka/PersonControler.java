package co.com.sofka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControler {

    @Autowired
    co.com.sofka.rest.RestController restController;

    @PostMapping("/person")
    public String create(String name){
       return restController.post(name);
    }
}
