package app.entity;

import java.sql.Timestamp;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "note_tags")
public class NoteTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private Integer tag_id;

    @Column(nullable = false)
    private Integer note_id;

    @ManyToOne
    private Note note;

    @ManyToOne
    private Tag tag;
}
