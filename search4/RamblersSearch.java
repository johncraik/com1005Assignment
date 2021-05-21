package search4;

public class RamblersSearch extends Search {

    private TerrainMap map; // map we're searching
    private Coords goal; // goal node

    // Constructor
    public RamblersSearch(TerrainMap m, Coords g) {
        map = m;
        goal = g;
    }

    //Return the map in the search
    public TerrainMap getMap() {
        return map;
    }

    //Return the goal node in the search
    public Coords getGoal() {
        return goal;
    }    
    
}
