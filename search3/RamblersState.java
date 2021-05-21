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
        int[][] terrain = map.getTmap();
        ArrayList<SearchState> succs = new ArrayList<>();

        //succesors to current node are horizontal and vertical (not diagonal)
        int currHeight = terrain[node.gety()][node.getx()];

        //maximum of 4 possible succs nodes
        for (int i = 0; i < 4; i++){
            Coords succsNode = null;
            if (i == 0){
                // top node
                succsNode = new Coords((node.gety() - 1), node.getx());// -1 on yaxies
            }
            else if (i == 1) {
                // bottom node
                succsNode = new Coords((node.gety() + 1), node.getx());// +1 on yaxies
            }
            else if (i == 2) {
                // left node
                succsNode = new Coords(node.gety(), (node.getx() - 1));// -1 on xaxies
            }
            else if (i == 3) {
                // right node
                succsNode = new Coords(node.gety(), (node.getx() + 1));// +1 on xaxies
            }


            try {
                /*
                 * calculate the cost using ramblers cost: if successor node is heigher: c = 1 +
                 * |succsHeight(y,x) - currHeight(y,x)| if not: c = 1
                 */
                int succsHeight = terrain[succsNode.gety()][succsNode.getx()];

                // Default cost for moving node
                int cost = 1;
                if (currHeight < succsHeight) {
                    // Add on the extra cost for going 'up hill'
                    cost += (int) Math.round(Math.abs(succsHeight - currHeight));
                }

                // Add the successor node to the list
                succs.add(new RamblersState(new Coords((node.gety() - 1), node.getx()), cost));
            } catch (Exception e) {
                // node is not in the map
            }
        }
        //return the list
        return succs;
    }
       

    @Override
    boolean sameState(SearchState n2) {
        RamblersState rs2 = (RamblersState) n2;
        Coords rs2Node = rs2.getNode();
        if (rs2Node.gety() == node.gety() && rs2Node.getx() == node.getx()){
            //same node
            return true;
        }

        //not the same node
        return false;
    }

    //return object as string (toString)
    public String toString(){
        return ("Pixel => x:" 
            + String.valueOf(node.getx()) 
            + ", y:" 
            + String.valueOf(node.gety())
        );
    }
}