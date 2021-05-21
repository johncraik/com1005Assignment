package search3;

import java.util.ArrayList;

public class RamblersState extends SearchState {

    //Current node in the search state:
    private Coords node;

    //Constructor:
    public RamblersState(Coords cnode, int lc) {
        node = cnode;
        localCost = lc;
    }

    //Get node
    public Coords getNode(){
        return node;
    }
    

    @Override
    boolean goalPredicate(Search searcher) {
        RamblersSearch rsearcher = (RamblersSearch) searcher;
        Coords goal = rsearcher.getGoal(); //Get the gaol node
        if (goal.getx() == node.getx() && goal.gety() == node.gety()){
            //If the goal and current node are equal, return true.
            return true;
        }

        //if the goal node is not the same as the current node, returns false.
        return false;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        RamblersSearch rsearcher = (RamblersSearch) searcher;
        TerrainMap map = rsearcher.getMap();
        ArrayList<SearchState> succs = new ArrayList<>();

        //succesors to current node are horizontal and vertical (not diagonal)


        return succs;
    }

    @Override
    boolean sameState(SearchState n2) {
        // TODO Auto-generated method stub
        return false;
    }

}