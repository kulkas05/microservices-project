package customerprofile;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConnectMongo extends MongoRepository<Customer, String> 
{

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}