package boxes;

/**
 * Created by Bill on 7/24/18.
 */

public class OneThingBox extends Box{
    private Thing thing;

    @Override
    public void add(Thing thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing != null && this.thing.equals(thing);
    }
}
