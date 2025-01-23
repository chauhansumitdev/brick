package Brick;

import java.util.*;
import Person.*;

public class BrickManager {
    private Map<Person, Brick> bricks;

    public BrickManager(){
        bricks = new HashMap<>();
    }

    /**
     * MARK :
     * DESC : THIS IS USED TO PRINT IF THERE IS BRICK CORRESPONDING TO THE USER
     * @param person
     */
    public void animate(Person person){
        for(Map.Entry<Person, Brick> entry : bricks.entrySet()){
            Person key = entry.getKey();
            Brick current_brick = entry.getValue();

            if(key == person){
                current_brick.animate_current();
            }
        }
    }

    /**
     * MARK :
     * DESC : THIS IS USED TO CREATE THE BRICK
     * @param person
     * @param brick
     * @return
     */
    public boolean create_brick(Person person, Brick brick){
        if(bricks.size() < 90){

            bricks.put(person, brick);
            
            System.out.println(" SYSTEM : BRICK CREATED ");

            return true;
        }

        

        return false;
    }


    /**
     * MARK :
     * DESC : THIS IS USED TO DELETE THE BRICK
     * @param person
     * @param brick
     */
    public void delete_brick(Person person, Brick brick){

        if(!bricks.containsKey(person)){
            System.out.println(" SYSTEM : DOES NOT CONTAIN BRICK ");
            return;
        }

        if(person instanceof Admin || bricks.containsKey(person)){
            bricks.remove(person);
        }
    }


    /**
     * MARK :
     * DESC : THIS IS USED TO ADD COMMENTS TO THE BRICK
     * @param to
     * @param from
     * @param message
     */
    public void add_comments(Person to, Person from, String message){
        if(bricks.containsKey(to)){
            Brick current_brick = bricks.get(to);
            current_brick.set_comment(from, message);
        }else{
            System.out.println(" SYSTEM : CANNOT ADD COMMENT, USER DOES NOT EXIST ");
        }
    }

    /**
     * MARK :
     * DESC : THIS IS USED TO DELETE THE COMMENT
     * @param person
     */
    public void delete_comment(Person person){
        for(Map.Entry<Person, Brick> entry : bricks.entrySet()){
            Brick current_brick = entry.getValue();

            Map<Person, String> current_comments = current_brick.get_comments();

            for(Map.Entry<Person, String> comment : current_comments.entrySet()){
                if(comment.getKey() == person){
                    current_comments.remove(person);

                    System.out.println(" SYSTEM :  COMMENT DELETED ");

                    return;
                }
            }
        }
        
        System.out.println(" SYSTEM : NO SUCH COMMENT EXIST ");
    }

    public Map<Person, Brick> get_bricks(){
        return bricks;
    }
}
