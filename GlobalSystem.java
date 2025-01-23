import java.util.*;

import Person.*;

public class GlobalSystem {

    public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        
        int status = 1000;

        while(status != 0){

            display();

            status = obj.nextInt();

            switch (status) {
                case 1:
                    Person person = display_user_related();

                    System.out.println(" SYSTEM : USER CREATED "+person);

                    break;
            
                default:
                    break;
            }

        }

    }

    public static Person display_user_related(){
        System.out.println(" SYSTEM : TO CREATE A NEW USER ENTER THE DETAILS : ");

        System.out.println(" SYSTEM : ENTER NAME :");
        String name = obj.next();
        System.out.println(" SYSTEM : ENTER CITY ");
        String city = obj.next();

        return new Person(name, city);
    }

    public static void display(){

        System.out.println();
        System.out.println();

        System.out.println(" SYSTEM :");
        System.out.println(" ENTER 1 - USER RELATED");
        System.out.println(" ENTER 2 - COUNTRY RELATED ");
        System.out.println(" ENTER 3 - CTY RELATED ");
        System.out.println(" ENTER 4 - WALL RELATED ");
        System.out.println(" ENTER 5 - BRICK RELATED ");
        System.out.println(" ENTER 6 - MAX POPULAR PERSON ");
        System.out.println(" ENTER 7 - LEAST POPULAR PERSON ");
        System.out.println(" ENTER 0 - EXIT ");

    }
}
