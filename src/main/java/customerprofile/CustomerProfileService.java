package customerprofile;

import java.util.*;
import javax.validation.Valid;
import javax.servlet.http.*;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.data.mongodb.*;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.annotation.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import com.mongodb.DB;
import customerprofile.ConnectMongo;

@Component
@RestController
@RequestMapping("/v1/customers")
public class CustomerProfileService
{   
    @Autowired
    private ConnectMongo repository;

    public CustomerProfileService()
    {
        super();
    }

    @RequestMapping(method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Customer addCustomerDetails(@RequestBody Customer c)
    {
        _log("Adding customer data : " + c);

        if(c == null)
            throw new ServiceException(406, "Error: need customer data", null);
            
        return repository.save(c);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Customer getCustomerById(@PathVariable("id") String i)
    {
        _log("Customer profile data: " + i );
        Customer c = repository.findOne(i);

        if(c == null)
            throw new ServiceException(404, "Error: unknown customer id: " + i, null);

        return c;
    }

    protected void _log(String s)
    {
        System.out.println(s);
    }

}