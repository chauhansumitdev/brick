package Country;

import java.util.*;

public class CountryManager {
    
    private List<Country> countries;

    public CountryManager(){
        countries = new ArrayList<>();
    }

    public void create_country(Country country){
        countries.add(country);
    }

    public List<Country> get_countries(){
        return countries;
    }

}
