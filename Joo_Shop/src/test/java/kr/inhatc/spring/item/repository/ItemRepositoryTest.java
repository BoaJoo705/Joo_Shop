package kr.inhatc.spring.item.repository;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.inhatc.spring.item.constant.ItemSellStatus;
import kr.inhatc.spring.item.entity.Item;

@SpringBootTest
public class ItemRepositoryTest {
	@Autowired
    ItemRepository itemRepository;
	
	public void createItemList(){
        for(int i=1;i<=10;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100); 
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            
//            Item savedItem = itemRepository.save(item);
        }
    }
	
	@Test
	void test() {
		Item item = new Item();
		System.out.println(item);
	}
}
