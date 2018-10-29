package com.pilu;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.pilu.person;
public class Testbean {
	person p;
	MongoClient mongo ;
	Testbean(person p1){
		this.p = p1;
		this.mongo = new MongoClient("localhost", 27017);
	}

	public void write() {

		
		

		System.out.println("Connected to the database successfully");
		MongoDatabase database = this.mongo.getDatabase("test");

		MongoCollection<Document> collection = database.getCollection("sampleCollections");
		System.out.println("Collection sampleCollection selected successfully");

		System.out.println("Document inserted successfully");

		// System.out.println("<h1>Your youtube data<h1>");
		// System.out.println("ID-> " + p.getId());
		// System.out.println("DESCRIPTION-> " + p.getDescription());
		// System.out.println("LIKES-> " + p.getLikes());
		// System.out.println("URL-> " + p.getUrl());
		// System.out.println("BY-> " + p.getBy());

		Document document = new Document("title", "MongoDB")

				.append("id", p.getId()).append("description",p.getDescription()).append("likes",p.getLikes())
				.append("url",p.getUrl()).append("by", p.getBy());
		collection.insertOne(document);

	}

}
