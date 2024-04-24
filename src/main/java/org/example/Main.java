package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {


        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("StorageMongoDB");
        mongoClient.listDatabaseNames().forEach(System.out::println);
        database.createCollection("suppliers");



    }
}