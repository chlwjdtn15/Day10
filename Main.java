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
*/

/*
class Main {
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
/*
// 문제 : 아래와 같이 출력 되도록 해주세요.
class Main {
  public static void main(String[] args) {
    캐릭터 a플레이어_캐릭터;
    
    a플레이어_캐릭터 = new 전사();
    a플레이어_캐릭터.공격();
    // 출력 : 전사가 대검으로 공격합니다.
    
    a플레이어_캐릭터 = new 마법사();
    a플레이어_캐릭터.공격();
    // 출력 : 마법사가 파이어볼로 공격합니다.
  }
}

abstract class 캐릭터 {
	
	abstract void 공격 ();
}

class 전사 extends 캐릭터 {
	String 캐릭터직업 = "전사";
	String 무기 = "대검";
	void 공격 () {
		System.out.printf("%s가 %s으로 공격합니다.\n", 캐릭터직업, 무기);
	}
}
	
class 마법사 extends 캐릭터 {
	String 캐릭터직업 = "마법사";
	String 무기 = "파이어볼";
	void 공격 () {
		System.out.printf("%s가 %s으로 공격합니다.\n", 캐릭터직업, 무기);
	}
}*/

/*
// 문제 : 아래와 같이 출력되게 해주세요.

class Main {
  public static void main(String[] args) {
    전사 a전사0 = new 전사();
    a전사0.나이 = 20;
    a전사0.이름 = "칸";
    a전사0.성격 = "차가움";
    a전사0.a무기 = new 활();
    
    전사 a전사1 = new 전사();
    전사 a전사2 = new 전사();
    전사 a전사3 = new 전사();
    전사 a전사4 = new 전사();
    전사 a전사5 = new 전사();
    
    System.out.println(a전사0.이름);
    // 출력 : 칸
    System.out.println(a전사1.이름);
    // 출력 : No Name
    System.out.println(a전사2.이름);
    // 출력 : No Name
    System.out.println(a전사3.이름);
    // 출력 : No Name
    System.out.println(a전사4.이름);
    // 출력 : No Name
    System.out.println(a전사5.이름);
    // 출력 : No Name
  }
}

class 전사 {
  int 나이;
  String 이름;
  String 성격;
  무기 a무기;
  
  // `전사()` 는 생성자 메서드 이다.
  // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
  // 생성자 메서드는 자동으로 호출됩니다.
  // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
  // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
  // 생성자 메서드는 리턴타입이 없습니다.
  // 당연하지만 생성자 메서드는 리턴값도 없습니다.
  전사() {
    // 수정가능지역 시작
    this.나이 = 20;
    this.이름 = "No name";
    this.성격 = "온순함";
    this.a무기 = new 칼();
    // 수정가능지역 끝
  }
}

abstract class 무기 {
  
}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}*/
/*
// 출력 : 아래와 같이 출력되게 해주세요.

class Main {
  public static void main(String[] args) {
    사람 a사람 = new 사람();
    a사람.나이 = 10;
    a사람.a왼팔 = new 팔();

    System.out.println(a사람.a왼팔.길이 + "cm");
    // 출력 : 100cm
  }
}

class 사람 {
	int 나이;
	팔 a왼팔;
}

class 팔 {
	int 길이;
	
	팔() {
		길이 = 100;
	}
}*/
/*
// 출력 : 아래와 같이 출력되게 해주세요.

class Main {
  public static void main(String[] args) {
    new 사람().걷다();
   
    System.out.println(new 사람().a왼팔.길이 + "cm");
    // 출력 : 100cm
  }
}
class 사람 {
  팔 a왼팔;

  사람 () {
    a왼팔 = new 팔();

    // 만약에 팔 클래스에 `팔` 생성자를 못 쓰는 상황이다.
    // 그렇다면 아래와 같은 코드가 필요하다.
    //a왼팔.길이 = 100;
  }

  void 걷다() {
    System.out.println("사람이 걷습니다.");
  }
}
class 팔 {
  int 길이;
  팔() {
    this.길이 = 100;    
  }
}*/


// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main {
  public static void main(String[] args) {
    int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;
    
    System.out.println(엄지손가락_길이 + "cm");
    // 출력 : 5cm
  }
}
class 사람 {
  팔 a왼팔;

  사람 () {
    a왼팔= new 팔();

  }


}

class 팔 {

  손 a손;
  팔 () {
    a손 = new 손();
  }
}

class 손 {
  손가락 a엄지손가락;

  손 () {
    a엄지손가락 = new 손가락();
  }
}

class 손가락 {
  int 길이;

  손가락 () {
    길이 = 5;
  }
}

