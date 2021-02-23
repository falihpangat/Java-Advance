package Mongo.JavaMongo;
import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;


public class Mongoconnect {
	public static void main(String[] args) {
		MongoClient mongodbconnect = new MongoClient( "localhost" , 27017 );
		System.out.println("connection estalished succseessfully");
	}
	 
	 
}
