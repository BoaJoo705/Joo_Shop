package kr.inhatc.spring.item.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import kr.inhatc.spring.item.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	List<Item> findByItemNm(String ItemNm);
	
}
