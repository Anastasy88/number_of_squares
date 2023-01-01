

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test

    public void shouldCalkExact(){
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.SQRService(200,300);

        Assertions.assertEquals(expected, actual);
    }
}
