package City;

import java.util.*;

public class CityManager {
    
    private List<City> cities;

    public CityManager(){
        cities = new ArrayList<>();
    }

    public void create_city(City city){
        cities.add(city);
    }

    public List<City> get_city(){
        return cities;
    }
}
