package com.javaex.ex03;

public class MyList<T> {

	//필드
	private T[] oArray;
	private int crtPos;
	
	
	//생성자
	public MyList() {
		this.oArray = (T[])new Object[3];// object로 모든애의 조상이라 아무거나 다들어감. 그래서 T로 포인트만 구분함
		crtPos = 0;
	}
	
	//메소드 gs
	
	//메소드 일반
	public void add(T object) {
		//배열의 크기가변 로직 생략
		oArray[crtPos] = object;
		crtPos = crtPos + 1;  //crtPos++
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index){
	    return oArray[index];
	}

//	@Override
//	public String toString() {
//		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
//	}
	
}
