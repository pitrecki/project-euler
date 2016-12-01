package task45;

/**
 * Created by Pitrecki on 2016-10-08.
 */
public class TriangleGenerator extends AbstractGenerator
{
    public TriangleGenerator() {
        super();
    }

    @Override
    public long generate(int n) {
        return (n * (n + 1)) / 2;
    }
}
