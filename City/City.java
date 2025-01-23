package City;

import Wall.WallManager;
import Person.Person;
import Wall.Wall;
import Brick.Brick;

import java.util.*;

import Brick.BrickManager;

public class City {

    private String city_name;

    private WallManager wall_manager;

    public City(){
        wall_manager = new WallManager();
    }

    public void set_city_name(String city_name){
        this.city_name = city_name;
    }

    public String get_city_name(){
        return city_name;
    }

    public WallManager get_wall_manager(){
        return wall_manager;
    }

    /**
     * MARK:
     * DESC : THIS IS USED TO FIND THE POPULARITY THAT IS THE MAX AND THE MIN POPULARITY
     */
    public void find_populartity(){
        Map<Person, Integer> popularity = new HashMap<>();

        for(Wall wall : wall_manager.get_walls()){
            BrickManager curr_BrickManager = wall.get_brick_manager();
            for(Map.Entry<Person, Brick> entry  : curr_BrickManager.get_bricks().entrySet()){

                Person key_person = entry.getValue().get_owner();

                Person dedicated_to = entry.getValue().get_dedicated_to();

                popularity.put(key_person,0);

                popularity.put(dedicated_to, popularity.getOrDefault(popularity, 0)+1);
            }
        }


        int max_freq = Integer.MIN_VALUE;
        Person max = null;
        Person min = null;

        for(Map.Entry<Person, Integer> entry : popularity.entrySet()){
            Person person = entry.getKey();
            int freq = entry.getValue();

            if(freq == 0){
                min = person;
            }

            if(freq >max_freq ){
                max_freq = freq;
                max = person;
            }
        }

        System.out.println(" SYSTEM : MAX :"+max+" MIN : "+min);

    }
}
