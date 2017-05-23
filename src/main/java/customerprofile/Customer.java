package customerprofile;

import org.springframework.data.annotation.Id;

public class Customer 
{

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String title;
    private String dob;
    private String phone;
    private String email;
    private String country;
    private String language;

    public Customer() 
    {
        super();
    }

    public Customer(String fn, String ln, String t, String d, String p, String e, String c, String l) 
    {
        setfirstName(fn);
        setlastName(ln);
        settitle(t);
        setdob(d);
        setphone(p);
        setemail(e);
        setcountry(c);
        setlanguage(l);
    }

    public String getId()
    {
        return id;
    }
    public void setId(String i)
    {
        id = i;
    }

    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String fn)
    {
        firstName = fn;
    }

    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String ln)
    {
        lastName = ln;
    }

    public String gettitle()
    {
        return title;
    }
    public void settitle(String t)
    {
        title = t;
    }

    public String getdob()
    {
        return dob;
    }
    public void setdob(String d)
    {
        dob = d;
    }

    public String getphone()
    {
        return phone;
    }
    public void setphone(String p)
    {
        phone = p;
    }

    public String getemail()
    {
        return email;
    }
    public void setemail(String e)
    {
        email = e;
    }

    public String getcountry()
    {
        return country;
    }
    public void setcountry(String c)
    {
        country = c;
    }

    public String getlanguage()
    {
        return language;
    }
    public void setlanguage(String l)
    {
        language = l;
    }

    @Override
    public String toString() 
    {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', title='%s', dob='%s', phone='%s', email='%s', country='%s', language='%s']",
                id, firstName, lastName, title, dob, phone, email, country, language);
    }

}