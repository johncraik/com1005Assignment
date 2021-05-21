package search4;

public class RunRamblersAstar {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("tmc.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(15, 15));
        SearchState initState = (SearchState) new RamblersState(new Coords(0, 0), 1, 1);

        String res_astar = searcher.runSearch(initState, "AStar");
        System.out.println(res_astar);
    }
}
