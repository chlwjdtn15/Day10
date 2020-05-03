/*
// 힌트 : if ( a무기 == null ) { ... }

class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
		a전사.공격();
		// 출력 => 아직 무기가 없습니다.
		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 => 칼로 공격합니다.
	}
}
class 전사 {
	
	무기 a무기;
	
	void 공격() {
		if (a무기 == null) {
			System.out.println("아직 무기가 없습니다.\n");
			
			return;
		}
		
			this.a무기.작동();

	}
		
}
*/
/*
class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
		
		a전사.a무기1 = new 칼();
		a전사.공격();
		// 출력 => 전사가 칼로 공격합니다.
		
		a전사.a무기1 = new 활();
		a전사.공격();
		// 출력 => 전사가 활로 공격합니다.
		
		a전사.a무기2 = new 칼();
		a전사.공격();
		// 출력 => 전사가 활로 공격합니다.
		// 출력 => 전사가 칼로 공격합니다.
	}
}
class 전사 {
	
	무기 a무기1;
	무기 a무기2;
	
	void 공격 () {
		if (this.a무기1 != null) {
			this.a무기1.작동();
		}
		
		if (this.a무기2 != null) {
			this.a무기2.작동();
		}
	}
}

abstract class 무기 {
	abstract void 작동 ();
}

class 칼 extends 무기 {
	void 작동 () {
		System.out.println("전사가 칼로 공격합니다.");
	}
}

class 활 extends 무기 {
	void 작동 () {
		System.out.println("전사가 활로 공격합니다.");
	}
}
*/

/*
class 무기 {
	void 작동 () {
		System.out.println();
	}
}

class 칼 extends 무기 {
	void 작동 () {
		System.out.println("칼로 공격합니다. \n");
	}
}

/*class Main {
	public static void main(String[] args) {
		전사 a전사1 = new 전사();

		a전사1.a왼손무기 = new 칼();
		a전사1.공격();
		// 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

		전사 a전사2 = new 전사();
		a전사2.a왼손무기 = new 창();
		a전사2.a오른손무기 = new 도끼();
		a전사2.공격();
		// 출력 => 전사가 왼손으로 창(을)를 사용합니다.
		// 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
	}
}

class 전사 {

	무기 a왼손무기;
	무기 a오른손무기;
	String 왼손 = "왼손";
	String 오른손 = "오른손";
	void 공격() {
		if (a왼손무기 != null) {
			this.a왼손무기.작동(this.왼손);
		}
		
		if (a오른손무기 != null) {
			this.a오른손무기.작동(this.오른손);
		}
		
	}
}

class 무기 {
	void 작동 (String 손) {
		
	}
}

class 칼 extends 무기 {
	void 작동 (String 손) {
		System.out.printf("전사가 " + 손 + "으로 칼(을)를 사용합니다.\n ");
	}
}

class 창 extends 무기 {
	void 작동 (String 손) {
		System.out.printf("전사가 " + 손 + "으로 창(을)를 사용합니다.\n ");
	}
}

class 도끼 extends 무기 {
	void 작동 (String 손) {
		System.out.printf("전사가 " + 손 + "으로 도끼(을)를 사용합니다.\n ");
	}
}
*/