package io.hanyoung.domain.photo;

import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.album.Album;
import io.hanyoung.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Photo extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String originalName;

    @Column(nullable = false)
    private String replacedName;

//    private User creator;
//    private Album album;
}
