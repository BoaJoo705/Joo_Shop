package kr.inhatc.spring.test.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {
	
	@Id
	private Long id;
	
	private String myName;
	private int myAge;
	
	private String myInfo;
}
