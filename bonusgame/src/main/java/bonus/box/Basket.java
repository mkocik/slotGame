package bonus.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class Basket {
    private List<Box> boxes = Arrays.asList(new Box(5), new Box(5), new Box(5), new Box(5), new Box(0));
    private List<Integer> alreadyChoosedIds;

    public Basket() {
        alreadyChoosedIds = new ArrayList<>();
        Collections.shuffle(boxes);
    }

    public Box getBox(Integer id) {
        if(!alreadyChoosedIds.contains(id)){
            alreadyChoosedIds.add(id);
            return boxes.get(id);
        }

        return null;
    }

    public int getBoxesSize() {
        return this.boxes.size();
    }
}
