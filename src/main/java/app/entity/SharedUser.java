package app.entity;

import javax.persistence.*;

@Entity
@Table(name = "shared_users")
public class SharedUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private Integer user_id;

    @Column(nullable = false)
    private Integer note_id;

    @Column(nullable = false)
    private Permission  permission;

    @ManyToOne
    private User user;

    @OneToOne
    private Note note;
}
