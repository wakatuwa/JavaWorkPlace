package com.sxt.io2;
/**
 * 模拟咖啡
 * 1、抽象组件：需要装饰的抽象对象(接口或抽象父类)
 * 2、具体组价：需要装饰的对象
 * 3、抽象装饰类：包含了对抽象组件间的引用以及装饰者共有的方法
 * 4、具体装饰类：被装饰的对象
 * @author wanghan
 *
 */
public class DecorateTest02 {
	public static void main(String[] args) {
		Drink coffee = new Coffee();
		System.out.println(coffee.info()+"-->" + coffee.cost());
		Drink sugar = new Sugar(coffee);
		System.out.println(sugar.info()+"-->" + sugar.cost());
		Drink milk = new Milk(coffee);
		System.out.println(milk.info()+"-->" + milk.cost());
		
		milk = new Milk(sugar);
		System.out.println(milk.info()+"-->" + milk.cost());
	}
	
}

//抽象组件
interface Drink{
	double cost();//费用
	String info();	//说明
}

//具体组件
class Coffee implements Drink{
	private String name = "原味咖啡";
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return 10;
	}

	@Override
	public String info() {
		// TODO 自动生成的方法存根
		return name;
	}
}

//抽象装饰类
abstract class Decorate implements Drink{
	private Drink drink;
	public Decorate(Drink drink) {
		this.drink = drink;
	}
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return this.drink.cost();
	}

	@Override
	public String info() {
		// TODO 自动生成的方法存根
		return this.drink.info();
	}
	//对抽象组件的引用
}

//具体装饰类1
class Milk extends Decorate {

	public Milk(Drink drink) {
		super(drink);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return super.cost()+20.0;
	}

	@Override
	public String info() {
		// TODO 自动生成的方法存根
		return super.info()+"加入了牛奶";
	}
}

//具体装饰类2
class Sugar extends Decorate {

	public Sugar(Drink drink) {
		super(drink);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return super.cost()+10.0;
	}

	@Override
	public String info() {
		// TODO 自动生成的方法存根
		return super.info()+"加入了糖";
	}
}	
