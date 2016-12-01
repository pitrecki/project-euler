package task45;

/**
 * Created by Pitrecki on 2016-10-08.
 */
public class HexagonalGenerator extends AbstractGenerator
{
    public HexagonalGenerator() {
        super();
    }

    @Override
    public long generate(int n) {
        return (n * (2*n - 1));
    }
}
