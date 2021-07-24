package co.com.sofka.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

public class RepositoryMongo {
    MongoClient mongoClient;
    public RepositoryMongo(){
        mongoClient = MongoClients.create();
    }

    public void save(String collection, Object object){
        mongoClient.getDatabase("db").getCollection(collection).insertOne((Document) object);
    }
}
