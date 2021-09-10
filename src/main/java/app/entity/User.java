package app.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column
    @UpdateTimestamp
    private Timestamp updatedAt;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private Set<Note> notes;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private Set<Tag> tags;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private Set<Bookmark> bookmarks;

    @OneToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private Set<SharedUser> sharedUsers;
}
