package stepanhampl.bible;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import stepanhampl.bible.api.HelloApiDelegate;

@Service
public class HelloDelegateImpl implements HelloApiDelegate {
    
    @Override
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("This is custom hello world message!");
    }
}