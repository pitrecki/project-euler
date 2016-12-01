package task45;

import java.util.List;

/**
 * Created by Pitrecki on 2016-10-08.
 */
public class PentagonalGenerator extends AbstractGenerator
{
    public PentagonalGenerator() {
        super();
    }


    @Override
    public long generate(int n) {
        return (n * (3*n - 1)) / 2;
    }
}
