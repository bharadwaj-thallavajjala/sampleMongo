package sampleMongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class configuration {
	
	@Configuration
	public class MongoConfig extends AbstractMongoConfiguration {
	  
	    @Override
	    protected String getDatabaseName() {
	        return "test";
	    }
	  
	    public Mongo mongo() throws Exception {
	        return new MongoClient("127.0.0.1", 27017);
	    }

		@Override
		public MongoClient mongoClient() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
