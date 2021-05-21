package search3;

public class RunRamblersBB {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("search3/map1.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(215, 112));
        SearchState initState = (SearchState) new RamblersState(new Coords(9, 41), 1);

         String res_bb = searcher.runSearch(initState, "branchAndBound");
         System.out.println(res_bb);

        //String res_astar = searcher.runSearch(initState, "AStar");
        //System.out.println(res_astar);
    }
}
