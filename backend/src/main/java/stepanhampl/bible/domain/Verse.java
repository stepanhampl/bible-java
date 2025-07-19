package stepanhampl.bible.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CzeCSP_verses")
public class Verse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book book;
    
    @Column(name = "chapter")
    private Integer chapter;
    
    @Column(name = "verse")
    private Integer verse;
    
    @Column(name = "text", columnDefinition = "TEXT")
    private String text;
    
    // Default constructor
    public Verse() {}
    
    // Constructor with parameters
    public Verse(Book book, Integer chapter, Integer verse, String text) {
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
        this.text = text;
    }
    
    // Getters and setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Book getBook() {
        return book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    
    public Integer getChapter() {
        return chapter;
    }
    
    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }
    
    public Integer getVerse() {
        return verse;
    }
    
    public void setVerse(Integer verse) {
        this.verse = verse;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
}