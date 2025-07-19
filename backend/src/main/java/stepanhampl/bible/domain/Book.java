package stepanhampl.bible.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CzeCSP_books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    // Default constructor
    public Book() {}
    
    // Constructor with parameters
    public Book(String name) {
        this.name = name;
    }
    
    // Getters and setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}