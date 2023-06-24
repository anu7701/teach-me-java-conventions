import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import powerpackage.PowerFinder;
public class PowerFinderTest {
    @Test
    public void onePowerOneIsOne() {
        Assertions.assertEquals(PowerFinder.OF(1,1) , 1);
    }

    @Test
    public void twoPowerOneIsTwo() {
        Assertions.assertEquals(PowerFinder.OF(2,1) , 2);
    }

    @Test
    public void twoPowerTwoIsFour() {
        Assertions.assertEquals(PowerFinder.OF(2, 2) , 4);
    }

    @Test
    public void threePowerTwoIsNine() {
        Assertions.assertEquals(PowerFinder.OF(3, 2) , 3*3);
    }
}
