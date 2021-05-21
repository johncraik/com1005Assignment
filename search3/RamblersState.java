package search3;

import java.util.ArrayList;

public class RamblersState extends SearchState {

    //Current node in the search state:
    private String node;

    //Constructor:
    public RamblersState(String cnode, int lc) {
        node = cnode;
        localCost = lc;
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