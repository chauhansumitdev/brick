package Country;

import City.CityManager;

public class Country {
    private String country_name;

    private CityManager city_manager;

    public Country(String country_name){
        this.country_name = country_name;
        city_manager = new CityManager();
    }

    public CityManager get_city_manager(){
        return city_manager;
    }

    public String get_country_name(){
        return country_name;
    }
}
