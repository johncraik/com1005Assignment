package search3;

import java.util.ArrayList;
import java.awt.Point;

public class RamblersState extends SearchState {

    //Current node in the search state:
    private Point node;

    //Constructor:
    public RamblersState(Point cnode, int lc) {
        node = cnode;
        localCost = lc;
    }

    //Get node
    public Point getNode(){
        return node;
    }
    

    @Override
    boolean goalPredicate(Search searcher) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    boolean sameState(SearchState n2) {
        // TODO Auto-generated method stub
        return false;
    }

}