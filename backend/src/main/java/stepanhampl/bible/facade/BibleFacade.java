package stepanhampl.bible.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import stepanhampl.bible.api.model.BibleVerseResponse;
import stepanhampl.bible.dto.RandomVerseDto;
import stepanhampl.bible.service.BibleService;

@Component
public class BibleFacade {
    
    private final BibleService bibleService;
    
    @Autowired
    public BibleFacade(BibleService bibleService) {
        this.bibleService = bibleService;
    }
    
    public BibleVerseResponse getRandomResponse() {
        RandomVerseDto dto = bibleService.getRandom();
        
        BibleVerseResponse response = new BibleVerseResponse();
        response.setBookName(dto.getBookName());
        response.setChapter(dto.getChapter());
        response.setVerse(dto.getVerse());
        response.setText(dto.getText());
        
        return response;
    }
}