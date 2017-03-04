package bonus.box;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class Box {
    private Integer value;

    public Box(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public boolean isBlocker() {
        return this.value == 0;
    }
}
