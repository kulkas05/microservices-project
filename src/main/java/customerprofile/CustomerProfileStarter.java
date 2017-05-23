package customerprofile;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.mongodb.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import customerprofile.ConnectMongo;

@Configuration
@SpringBootApplication
public class CustomerProfileStarter
{
    public static void main(String[] args)
    {
        SpringApplication.run(CustomerProfileStarter.class,args);
    }
}
