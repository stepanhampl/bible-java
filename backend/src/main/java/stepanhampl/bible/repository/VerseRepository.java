package stepanhampl.bible.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stepanhampl.bible.domain.Verse;
import stepanhampl.bible.dto.RandomVerseDto;

import java.util.List;

@Repository
public interface VerseRepository extends JpaRepository<Verse, Integer> {
    
    @Query(value = "SELECT b.name as bookName, v.chapter, v.verse, v.text " +
                   "FROM CzeCSP_verses v JOIN CzeCSP_books b ON v.book_id = b.id " +
                   "ORDER BY RAND() LIMIT 1", nativeQuery = true)
    List<Object[]> findRandomVerseData();
}