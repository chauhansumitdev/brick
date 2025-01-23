package Wall;

import java.util.*;

import Person.Person;
import Person.User;

public class WallManager {
    
    private List<Wall> walls;

    public WallManager(){
        walls = new ArrayList<>();
    }

    public List<Wall> get_walls(){
        return walls;
    }

    /**
     * MARK :
     * DESC : THIS IS USED TO ADD THE WALL IF THE CURRENT WALL COUNT IS GREATER THAN ZERO OR DOES NOT EXIST
     * @param wall
     */
    public void add_wall(Wall wall){

        if(walls.size() == 0 || walls.get(walls.size()).get_brick_manager().get_bricks().size() > 90){
            walls.add(wall);
        }
        
    }

    /**
     * MARK : 
     * DESC : THIS IS USED TO DELETE THE WALL IF THE PERSON IS ADMIN
     * @param person
     * @param wall
     */
    public void delete_wall(Person person , Wall wall){

        if(person instanceof User){
 
            System.out.println(" SYSTEM : RESTRICTED ACCESS ");

            return;
        }

        for(Wall curr_wall : walls){
            if(curr_wall == wall){
                walls.remove(wall);
                System.out.println(" SYSTEM : WALL "+curr_wall +" REMOVED ");
                return;
            }
        }

        System.out.println(" SYSTEM : NO SUCH WALL PRESENT ");
    }
}
