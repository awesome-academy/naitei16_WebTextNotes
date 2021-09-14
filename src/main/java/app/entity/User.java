package app.entity;

import java.sql.Timestamp;
import java.util.Date;
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
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    private Boolean rememberPwd;

    @Column
    @CreationTimestamp
    private Timestamp createdAt;

    @Column
    @UpdateTimestamp
    private Timestamp updatedAt;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    @Override
    public String toString() {
        System.out.println("to String");
        return getId() + " -  " +  getUsername() + " -  "+ getPassword();
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
