import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculate(int expected, int amount, boolean registred) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registred);
        Assertions.assertEquals(expected, actual);
    }
}
