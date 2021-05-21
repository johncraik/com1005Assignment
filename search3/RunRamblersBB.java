package search3;

public class RunRamblersBB {
    public static void main(String[] arg) {

        TerrainMap map = new TerrainMap("tmc.pgm");

        RamblersSearch searcher = new RamblersSearch(map, new Coords(15, 15));
        SearchState initState = (SearchState) new RamblersState(new Coords(0, 0), 1);

         String res_bb = searcher.runSearch(initState, "branchAndBound");
         System.out.println(res_bb);
    }
}
