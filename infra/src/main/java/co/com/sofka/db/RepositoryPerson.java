package co.com.sofka.db;

import co.com.sofka.domain.Person;
import co.com.sofka.usecases.IRepositoryPerson;

public class RepositoryPerson implements IRepositoryPerson {
    private RepositoryMongo repositoryMongo;

    public RepositoryPerson() {
        this.repositoryMongo = new RepositoryMongo();
    }

    public void save(Person person){
        repositoryMongo.save("person", person);
    }
}
