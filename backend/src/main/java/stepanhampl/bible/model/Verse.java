package stepanhampl.bible.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CzeCSP_verses")
@Getter
@Setter
@NoArgsConstructor
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
}
