package stepanhampl.bible.dto;

public class RandomVerseDto {
    private String bookName;
    private Integer chapter;
    private Integer verse;
    private String text;
    
    public RandomVerseDto(String bookName, Integer chapter, Integer verse, String text) {
        this.bookName = bookName;
        this.chapter = chapter;
        this.verse = verse;
        this.text = text;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public Integer getChapter() {
        return chapter;
    }
    
    public Integer getVerse() {
        return verse;
    }
    
    public String getText() {
        return text;
    }
}