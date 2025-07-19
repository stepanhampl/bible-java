package stepanhampl.bible;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureWebMvc
class HelloDelegateImplTest {

    @Autowired
    private HelloDelegateImpl helloDelegateImpl;

    @Test
    void testHelloDelegateMethod() {
        var response = helloDelegateImpl.hello();
        
        assert response.getStatusCode().is2xxSuccessful();
        assert response.getBody().equals("This is custom hello world message!");
    }
}