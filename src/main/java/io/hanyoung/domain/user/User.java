package io.hanyoung.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.photo.Photo;
import io.hanyoung.domain.schedule.Schedule;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column
    private String nickname;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @Column(nullable = false)
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    private boolean enable = false;

//    private List<Schedule> schedules;
//    private List<Photo> photoList;


    @Builder
    public User(String email, String name, String nickname, String picture, String password) {
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.picture = picture;
        this.password = password;
    }

    public User update(String name, String nickname, String picture) {
        this.name = name;
        this.nickname = nickname;
        this.picture = picture;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
