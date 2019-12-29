package io.hanyoung.domain.shopping;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingRepositoryTest {

    @Autowired
    private ShoppingRepository shoppingRepository;

    @After
    public void cleanup() {
        shoppingRepository.deleteAll();
    }

    @Test
    public void 저장_and_불러오기() {
        String itemName = "item 1";
        String place = "place 1";

        shoppingRepository.save(Shopping.builder()
        .itemName(itemName)
        .place(place)
        .build());

        // when
        List<Shopping> shoppingList = shoppingRepository.findAll();
        assertThat(shoppingList.size()).isEqualTo(1);

        Shopping shopping = shoppingList.get(0);

        assertThat(shopping.getItemName()).isEqualTo(itemName);
        assertThat(shopping.getPlace()).isEqualTo(place);

    }
}