package com.sxt.io2;
/**
 * 实现放大器对声音的放大功能
 * @author wanghan
 *
 */
public class DecorateTest01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		
		//装饰
		Amplifier am = new Amplifier(p);
		am.say();
	}
}

interface Say{
	void say();
}

class Person implements Say{
	//属性
	private int voice = 10;
	public void say() {
		System.out.println("人的声音为：" + this.getVoice());
	}
	
	public int getVoice() {
		return voice;
	}
	
	public void setVoice(int voice) {
		this.voice = voice;
	}
	
}

class Amplifier implements Say{
	private Person p;
	Amplifier(Person p) {
		this.p = p;
	}
	public void say() {
		System.out.println("人的声音为：" + p.getVoice()*100);
		System.out.println("噪音。。。");
		
	}
}


