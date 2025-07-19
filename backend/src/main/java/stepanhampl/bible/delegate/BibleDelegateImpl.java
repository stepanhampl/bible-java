package stepanhampl.bible.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import stepanhampl.bible.api.BibleApiDelegate;
import stepanhampl.bible.api.model.BibleVerseResponse;
import stepanhampl.bible.facade.BibleFacade;

@Service
public class BibleDelegateImpl implements BibleApiDelegate {
    
    private final BibleFacade bibleFacade;
    
    @Autowired
    public BibleDelegateImpl(BibleFacade bibleFacade) {
        this.bibleFacade = bibleFacade;
    }
    
    @Override
    public ResponseEntity<BibleVerseResponse> getBibleRandom() {
        BibleVerseResponse response = bibleFacade.getRandomResponse();
        return ResponseEntity.ok(response);
    }
}
