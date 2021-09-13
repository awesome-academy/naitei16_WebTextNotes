package app.entity;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String  label;

    @Column
    private String  content;

    @Column
    private Background background;

    @Column
    private String  image_url;

    @Column(nullable = false)
    private Integer  user_id;

    @Column
    private Boolean is_trashed;

    @Column
    private Boolean is_deleted;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column
    @UpdateTimestamp
    private Timestamp updatedAt;

    @ManyToOne
    private User user;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="note_id")
    private Set<NoteTag> noteTags;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "note_id")
    private Bookmark bookmark;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="note_id")
    private Set<SharedUser> sharedUsers;
}
