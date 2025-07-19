package stepanhampl.bible.delegate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@AutoConfigureWebMvc
class HelloDelegateImplTest {

    @Autowired
    private HelloDelegateImpl helloDelegateImpl;

    @Test
    void testHelloDelegateMethod() {
        var response = helloDelegateImpl.hello();
        
        assertTrue(response.getStatusCode().is2xxSuccessful());
    }
}
