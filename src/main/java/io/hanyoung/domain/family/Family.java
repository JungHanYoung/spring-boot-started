package io.hanyoung.domain.family;

import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Family extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String familyName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FamilyType familyType;

    @Column(nullable = false)
    private String identity;

    @Column(nullable = false)
    private boolean enable = false;

//    private List<User> members;


}
