package Brick;

import Person.*;
import java.util.*;

/*
 * MARK :
 * DESC - THIS IS THE BRICK CLASS WHICH CONTAINS THE FUNDAMENTAL OPERATIONS DEDICATED TO THE BRICK CLASS
 */

public class Brick {

    private Person owner;
    private Person dedicated_to;
    private String caption;
    private String message;
    private int flagged;
    private boolean visibility;
    private Map<Person, String> comments;

    public Brick(Person owner, Person dedicated_to, String caption, String message){
        comments = new HashMap<>();
        flagged = 0;
        visibility = true;

        this.owner = owner;
        this.dedicated_to = dedicated_to;
        this.caption= caption;
        this.message = message;
    }

    /**
     * MARK : 
     * DESC : THIS IS USED TO PRINT THE STATE OF THE CURRENT BRICK
     */
    public void animate_current(){
        System.out.println(" OWNER : "+owner+ " "+ owner.get_name());
        System.out.println(" DEDICATED TO : "+dedicated_to+" "+dedicated_to.get_name());
        System.out.println(" CAPTION :"+caption);
        System.out.println(" MESSAGE :"+message);
        System.out.println(" COMMENTS :");

        for(Map.Entry<Person, String> entry : comments.entrySet()){
            Person person  = entry.getKey();
            String comment = entry.getValue();

            System.out.println(" -- "+person+" "+comment);
        }

    }
    

    /**
     * MARK : 
     * DESC : THIS IS USED TO EDIT THE CURRENT BRICK
     * @param editor
     * @param owner
     * @param dedicated_to
     * @param caption
     * @param message
     */

    public void edit(Person editor, Person owner, Person dedicated_to, String caption, String message){
        if(editor instanceof Admin || editor == owner){

            if(editor instanceof Admin){

                System.out.println(" SYSTEM : ADMIN ACCESS ");

                this.owner = owner;
            }

            this.dedicated_to = dedicated_to;
            this.caption = caption;
            this.message = message;

        }else{
            System.out.println(" SYSTEM : CANNOT EDIT BRICK, ACCESS RESTRICED ");
        }
    }

    public boolean get_visibility(){
        return visibility;
    }

    public void set_visibility(boolean visibility){
        this.visibility = visibility;
    }

    public int get_flagged_count(){
        return flagged;
    }

    public void increment_flagged_count(){
        flagged += 1;

        if(flagged >= 10){
            visibility = false;
        }
    }

    public void set_dedicated_to(Person dedicated_to){
        this.dedicated_to = dedicated_to;
    }

    public Person get_dedicated_to(){
        return dedicated_to;
    }

    public Map<Person, String> get_comments(){
        return comments;
    }

    /**
     * MARK:
     * DESC : THIS IS USED TO ADD COMMENT TO THE CURRENT BRICK
     * @param person
     * @param comment
     */
    public void set_comment(Person person, String comment){
        comments.put(person, comment);
        System.out.println(" SYSTEM : COMMENT ADDED  TO " + this);
    }

    public void set_message(String message){
        this.message = message;
    }

    public String get_message(){
        return message;
    }


    public void set_caption(String caption){
        this.caption = caption;
    }

    public String get_caption(){
        return caption;
    }

    public void set_owner(Person person){
        this.owner = person;
    }

    public Person get_owner(){
        return owner;
    }
    
}
