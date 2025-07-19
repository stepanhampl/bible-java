package stepanhampl.bible.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stepanhampl.bible.domain.Verse;

import java.util.List;

@Repository
public interface VerseRepository extends JpaRepository<Verse, Integer> {
    
    @Query("SELECT v FROM Verse v ORDER BY FUNCTION('RAND')")
    List<Verse> findAllRandomized();
}