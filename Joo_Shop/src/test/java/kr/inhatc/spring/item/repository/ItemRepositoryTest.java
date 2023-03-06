package kr.inhatc.spring.item.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.persistence.EntityManager;
import kr.inhatc.spring.item.constant.ItemSellStatus;
import kr.inhatc.spring.item.entity.Item;



@SpringBootTest
public class ItemRepositoryTest {
	
	@Autowired
	EntityManager em;
	
	@Autowired
    ItemRepository itemRepository;
	
	public void createItemList(){
        for( int i=1; i<=10; i++ ){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100); 
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            
            Item savedItem = itemRepository.save(item);
        }
    }
	
	@Test
    @DisplayName("상품명 조회 테스트")
    public void findByItemNmTest(){
        this.createItemList(); //10개 만들어 DB넣어
        List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
	
	@Test
	void test() {
		Item item = new Item();
		System.out.println(item);
	}
}
