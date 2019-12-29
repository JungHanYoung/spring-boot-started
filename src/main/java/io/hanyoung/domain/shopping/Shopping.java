package io.hanyoung.domain.shopping;

import io.hanyoung.domain.BaseTimeEntity;
import io.hanyoung.domain.family.Family;
import io.hanyoung.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Shopping extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String itemName;

    @Column
    private String place;

//    private User creator;
//    private Family family;

    @Builder
    public Shopping(String itemName, String place) {
        this.itemName = itemName;
        this.place = place;
    }

}
