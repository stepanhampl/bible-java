package stepanhampl.bible.mapper;

import org.mapstruct.Mapper;
import stepanhampl.bible.api.model.BibleVerseResponse;
import stepanhampl.bible.model.Verse;

@Mapper(componentModel = "spring")
public interface BibleVerseMapper {
    BibleVerseResponse toResponse(Verse verse);
}
