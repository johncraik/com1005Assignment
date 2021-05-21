package search3;

public class RunRamblersBB {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("search3/tmc.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(14, 9));
        SearchState initState = (SearchState) new RamblersState(new Coords(0, 0), 1);

        // change from search1 - specify strategy

         String res_bf = searcher.runSearch(initState, "depthFirst");
         System.out.println(res_bf);
         String res_bb = searcher.runSearch(initState, "branchAndBound");
         System.out.println(res_bb);

        //String res_astar = searcher.runSearch(initState, "AStar");
        //System.out.println(res_astar);
    }
}
