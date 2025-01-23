import Brick.Brick;
import City.City;
import Person.Person;
import Person.User;
import Wall.Wall;

public class Main {

    public static void main(String[] args) {
    	
        City city = new City();

        Wall wall =  new Wall();

        city.get_wall_manager().add_wall(wall);

        Person person = new User("A","City1");

        Person person_to = new User("B","City2");

        Brick brick = new Brick(person, person_to, "This is a caption", "This is a message");

        wall.get_brick_manager().create_brick(person, brick);

        Person commenter = new User("Commentor", "Noida");

        brick.set_comment(commenter, "This is a comment");

        brick.animate_current();

        city.find_populartity();
    }

}
