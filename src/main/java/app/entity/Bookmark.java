package app.entity;

import javax.persistence.*;

@Entity
@Table(name = "bookmarks")
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private Integer user_id;

    @Column(nullable = false)
    private Integer note_id;

    @ManyToOne
    private User user;

    @OneToOne
    private Note note;
}
