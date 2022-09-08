package cardDeck;

public class Card {
//클래스 별로 관리되며 , 클래스 영역에 클래스로딩됨과 동시에 올라감,공용데이터 활용
static final int KIND_MAX =4;//카드무늬의 개수
static final int KIND_NUM=13;//무늬별 카드수

//무늬를 상수로 지정
static final int SPADE =4;
static final int DIAMOND =3;
static final int HEART =2;
static final int CLOVER =1;

int kind;
int number;
public Card(int kind, int number) {
	super(); //오브젝트 의 기본생성자를 호출하는것
	this.kind = kind;
	this.number = number;
}
@Override
	public String toString() {
	//지역변수는 반드시 초기화
	String kind = "";
	String number = "";
	//무늬 설정
	switch(this.kind) {
	case 4:
		kind = "스페이드";
		break;
	case 3:
		kind = "다이아몬드";
		break;
	case 2:
		kind = "하트";
		break;
	case 1:
		kind = "클로버";
		break;
	
	}
	//숫자 설정
	switch(this.number) {
	case 13:
		number ="K";
		break;
	case 12:
		number ="Q";
		break;
	case 11:
		number ="J";
		break;
	default:
		number=this.number+"";
	}
	return "무늬 : " + kind + ", 숫자 : " + number;
	
	}


}
