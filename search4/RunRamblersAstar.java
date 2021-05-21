package search4;

public class RunRamblersAstar {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("diablo.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(1, 50));
        SearchState initState = (SearchState) new RamblersState(new Coords(56, 60), 0, 0);

        float res_astar = searcher.runSearchE(initState, "AStar");
        System.out.println(res_astar);
    }
}
