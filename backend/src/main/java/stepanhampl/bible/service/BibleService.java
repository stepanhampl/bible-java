package stepanhampl.bible.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stepanhampl.bible.domain.Verse;
import stepanhampl.bible.repository.VerseRepository;

import java.util.List;

@Service
public class BibleService {
    
    private final VerseRepository verseRepository;
    
    @Autowired
    public BibleService(VerseRepository verseRepository) {
        this.verseRepository = verseRepository;
    }
    
    public Verse getRandom() {
        List<Verse> allVerses = verseRepository.findAll();
        if (!allVerses.isEmpty()) {
            // Return a random verse from the list
            int randomIndex = (int) (Math.random() * allVerses.size());
            return allVerses.get(randomIndex);
        }
        return null;
    }
}