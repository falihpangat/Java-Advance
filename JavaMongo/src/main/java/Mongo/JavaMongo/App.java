package Mongo.JavaMongo;
import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
          
       
        try{  
        //---------- Connecting DataBase -------------------------//  
        Mongoconnect mongoClient = new MongoClient( "localhost" , 27017 );  
        //---------- Creating DataBase ---------------------------//  
        MongoDatabase db = mongoClient.getDatabase("falih");  
        //---------- Creating Collection -------------------------//  
        MongoCollection<Document> table = db.getCollection("user");  
        //---------- Creating Document ---------------------------//    
        Document doc = new Document("name", "Peter John");  
        doc.append("id",12);  
        //----------- Inserting Data ------------------------------//  
        table.insertOne(doc);  
        }catch(Exception e){  
        System.out.println(e);  
        }  
        }  
        
    }

