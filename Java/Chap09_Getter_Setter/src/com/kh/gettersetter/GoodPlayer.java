package com.kh.gettersetter;

public class GoodPlayer { //set으로 전달받고 get으로 출력하는에휴
	
	private String name; 
	private int hp; //체력
	private int attackPower; //공격력

	//set: 값을 저장하기만 하는 기능 (검증 기능이없어용..)
	//그래서 valid를 또 만들어서 검증을 한다~
	//---------------------------------------------------------	
	
	public void setName(String name) { //1) 이름이 변경되면 저장될 set
		this.name = name;
	}
	
	//검증하는 valid
	public void ValidName() { //2) 캐릭터 이름에 공백이 없는지 검증
		if(this.name == "") {
			this.name = "No name";
			System.out.println("이름을 넣지 않았습니다.");
		}
	}
	
	public String getName() { //3) 캐릭터 이름을 반환
		return name;
	}
	
	//---------------------------------------------------------	
	
	public void setHp(int hp) { //1) 매개변수에 저장된 체력 저장하는 곳 (체력이 변경되면 저장될 set)
		this.hp = hp;
	}
	
	public void ValidHp() { //2) 체력이 0이 되는지 검증
		if(this.hp <= 0) { //체력이 0 이하가 되면 체력값 0으로 저장하고 그냥 기절
			this.hp = 0;
			System.out.println(name + "은 기절했다!\n");
		}
	}
	
	public int getHp() { //3) 캐릭터 체력을 반환
		return hp; //함수 내 반환값 O
	}
	
	
	//---------------------------------------------------------	
	
	public void setAP(int attackPower) { // AP: Attack Power
		this.attackPower = attackPower;
	}
	
	public void ValidAP() {
		if(this.attackPower < 0) { //공격력이 0보다 작으면 그냥 0으로 저장
			this.attackPower=0;
			System.out.println("유효하지 않은 공격력입니다.");
		}
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	//---------------------------------------------------------	
	
	//캐릭터 정보 출력
		public void displayInfo() {
			System.out.println("< 캐릭터 정보 >\n닉네임 : " + this.name);
			System.out.println("HP : " + this.hp);
			System.out.println("공격력 : " + attackPower + "\n");
		}
		
		//캐릭터 공격하는 출력 메서드
		public void attack(GoodPlayer player2) {
			System.out.println(name + "의 드래곤다이브!\n" + player2.getName() + "은(는) " + attackPower + "의 공격을 받았다.");
		}
		
		//다른 캐릭터로부터 공격 받았을 때 메서드
		public void takeDamage(int damage) {
			System.out.println("공격 받았습니다.");
		}
	

}