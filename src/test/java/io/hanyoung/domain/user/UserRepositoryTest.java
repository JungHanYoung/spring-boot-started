package io.hanyoung.domain.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void 저장_불러오기() {

        String name = "정한영";
        String email = "8735132@gmail.com";
        String password = "12341234";
        String nickname = "Ajung";
        String picture = "...";

        userRepository.save(User.builder()
        .email(email)
        .name(name)
        .nickname(nickname)
        .picture(picture)
        .password(password)
        .build());

        // when
        List<User> userList = userRepository.findAll();

        // then
        assertThat(userList.size()).isEqualTo(1);

        User user = userList.get(0);

        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getName()).isEqualTo(name);
        assertThat(user.getNickname()).isEqualTo(nickname);
        assertThat(user.getPicture()).isEqualTo(picture);

    }

}