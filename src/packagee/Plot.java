package packagee;

import Objects.*;
import holderr.*;

import java.util.Arrays;
import java.util.List;

public class Plot {
    private final Snusmumric snusmumric = new Snusmumric("снюсмумрик",1000);
    private final Hatifnaff hatifnaff = new Hatifnaff("хатифнафик", 10);
    private final Seeds seeds = new Seeds("семена", SizeOfObject.SMALL, ColourofSeeds.WHITE);
    private final Holder bag = new Holder("мешок","хз", "кожанный",  HolderState.FOOL, Arrays.asList(seeds), SizeOfObject.BIG);

    private final Holder backpack = new Holder("рюкзак","хз", "кожаный", HolderState.FOOL, List.of(bag), SizeOfObject.MIDDLE);


    public void run() {
        backpack.open();
        snusmumric.search(backpack);
        bag.keepItems();
        snusmumric.pull(bag, backpack);
        snusmumric.pull(seeds, bag);
        snusmumric.throwSeeds(Location.FENCE, Location.GRASS, Distance.FAR, Emotion.CAREFUL, seeds);
        backpack.close();
        hatifnaff.cling();
        bag.clearHolder();
        bag.setHolderState(HolderState.EMPTY);
        snusmumric.waitt();
    }
}
