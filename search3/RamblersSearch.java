package search3;

import java.awt.Point;

public class RamblersSearch extends Search {

    private TerrainMap map; // map we're searching
    private Point goal; // goal node

    // Constructor
    public RamblersSearch(TerrainMap m, Point g) {
        map = m;
        goal = g;
    }

    //Return the map in the search
    public TerrainMap getMap() {
        return map;
    }

    //Return the goal node in the search
    public Point getGoal() {
        return goal;
    }    
    
}
