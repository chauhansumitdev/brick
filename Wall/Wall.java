package Wall;

import Brick.BrickManager;

public class Wall {
    
    private BrickManager brick_manager;

    public Wall(){
        brick_manager = new BrickManager();
    }

    public BrickManager get_brick_manager(){
        return brick_manager;
    }
}
