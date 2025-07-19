package stepanhampl.bible.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stepanhampl.bible.dto.RandomVerseDto;
import stepanhampl.bible.repository.VerseRepository;

import java.util.List;

@Service
public class BibleService {
    
    private final VerseRepository verseRepository;
    
    @Autowired
    public BibleService(VerseRepository verseRepository) {
        this.verseRepository = verseRepository;
    }
    
    public RandomVerseDto getRandom() {
        List<Object[]> result = verseRepository.findRandomVerseData();
        if (!result.isEmpty()) {
            Object[] row = result.get(0);
            return new RandomVerseDto(
                (String) row[0],  // bookName
                (Integer) row[1], // chapter
                (Integer) row[2], // verse
                (String) row[3]   // text
            );
        }
        return null;
    }
}