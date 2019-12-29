package io.hanyoung.domain.album;

import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.family.Family;
import io.hanyoung.domain.photo.Photo;
import io.hanyoung.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Album extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

//    private User creator;
//    private List<Photo> photoList;
//    private Family family;
}
