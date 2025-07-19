package stepanhampl.bible.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import stepanhampl.bible.api.model.BibleVerseResponse;
import stepanhampl.bible.domain.Verse;
import stepanhampl.bible.service.BibleService;

@Component
public class BibleFacade {
    
    private final BibleService bibleService;
    
    @Autowired
    public BibleFacade(BibleService bibleService) {
        this.bibleService = bibleService;
    }
    
    public BibleVerseResponse getRandomResponse() {
        Verse verse = bibleService.getRandom();
        
        BibleVerseResponse response = new BibleVerseResponse();
        response.setBookName(verse.getBook().getName());
        response.setChapter(verse.getChapter());
        response.setVerse(verse.getVerse());
        response.setText(verse.getText());
        
        return response;
    }
}