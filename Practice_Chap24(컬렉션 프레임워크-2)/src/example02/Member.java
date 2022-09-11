package example02;

import java.util.Objects;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name , int age) {
	this.name=name;
	this.age=age;
	}
	//논리적 동등 객체의 조건
	//1.해쉬코드가 같아야한다 해시코드 재정의 필요
	//2.두개의 객체들의 멤버변수의 값들이 같아야한다 equals재정의 필요

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("해시코드 호출");
		return Objects.hash(this.name,this.age);
	}
//	@Override
//	public int hashCode() {
//		System.out.println("해시코드 호출");
//		return this.name.hashCode()+this.age;
//	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return(member.name.equals(this.name))&&(this.age==member.age);
		}
		else {
			return false;
		}
		
	}
	
	
}
