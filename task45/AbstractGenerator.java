package task45;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pitrecki on 2016-10-08.
 */
public abstract class AbstractGenerator
{
    private List<Long> generatedNumbersList;
    public final static int ITERATION_SIZE = 50*1000;

    public AbstractGenerator() {
        this.generatedNumbersList = new ArrayList<>();
    }

    public List<Long> getGeneratedNumbersList() {
        return generatedNumbersList;
    }

    public void addNumberToList(long value) {
        this.generatedNumbersList.add(value);
    }

    public long getNumberFromList(int index) {
        return this.generatedNumbersList.get(index);
    }

    public abstract long generate(int n);


}
