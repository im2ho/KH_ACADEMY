package com.kh.gettersetter;

public class PlayerCharacter {
	
	//필드값(원본)
	private String name; 
	private int hp; 
	private int attackPower;
	
	/**
	Getter
		(데이터 '복사본'을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음 원본데이터는 안전함
		Run파일의 set에서 검증된 역할을 받아서 전달해줌..
		
	Setter
		외부에서 메서드를 통해 데이터에 접근을 하게 된다면
		메서드는 매개값(매개변수)을 검증해서 유효한 값만 데이터로 저장할 수 있음
		
		set: 원본의 내용...이라고 보면 될듯.. 각각 만들어서 수정을 하든 뭘하든 암튼~ (ppt로 치면 한 페이지씩 떼와서 수정)
		
		set: 생성자 (반환값을 띄울 수가 x)
	**/
	
	public String getName() { //1. get으로 이름을 복사
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	
	//valid -> 검증할 때 쓰는 이름
	public void isValidHp() {}
	
	
	public void setName(String name) {//2. set에 이름을 넣어줌
		this.name = name;
	}
	
	public void setHp(int hp) {
		//만약에 체력이 0이라면 죽이고 체력이 1 이상이면 살리자
		if(hp>0) {
			this.hp = hp;
		} else { //체력이 0 이하라면 체력을 표시할 가치도 없다..
			System.out.println(name + "은(는) 기절했다!");
		}
	}
	
	// 값을 넣어도 0 이하의 값은 출력되지 않음
	public void setAttackPower(int attackPower) {
		//만약에 공격력이 0보다 클 경우
		if(attackPower>0) {
			this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("공격력이 부적절 합니다.");
		}
		
	}
	
	//캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("< 캐릭터 정보 >\n닉네임 : " + name);
		System.out.println("HP : " + hp);
		System.out.println("공격력 : " + attackPower + "\n");
	}
	
	//캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println(name + "의 드래곤다이브!\n" + target.getName() + "은(는) " + attackPower + "의 공격을 받았다.");
	}
	
	//다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다.");
	}
	
}
