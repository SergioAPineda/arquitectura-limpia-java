package co.com.sofka.rest;

import co.com.sofka.db.RepositoryPerson;
import co.com.sofka.usecases.CreatePersonUseCase;


public class RestController {

    private CreatePersonUseCase createPersonUseCase;

    public RestController(){
        RepositoryPerson repositoryPerson = new RepositoryPerson();
        createPersonUseCase = new CreatePersonUseCase(repositoryPerson);
    }

    public String post(String name){
        createPersonUseCase.create(name);

        return "ok";
    }
}
