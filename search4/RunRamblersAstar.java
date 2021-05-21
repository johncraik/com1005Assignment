package search4;

public class RunRamblersAstar {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("diablo.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(87,5));
        SearchState initState = (SearchState) new RamblersState(new Coords(76, 87), 0, 0);

        float res_astar = searcher.runSearchE(initState, "AStar");
        System.out.println(res_astar);
    }
}
