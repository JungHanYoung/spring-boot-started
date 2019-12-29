package io.hanyoung.domain.message;

import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.family.Family;
import io.hanyoung.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Message extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

//    private User creator;
//    private Family family;
}
