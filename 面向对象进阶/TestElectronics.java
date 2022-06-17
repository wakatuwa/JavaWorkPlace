package ObjectOrientedAdvanced;
/**
 * 测试向下转型
 * @author wanghan
 *
 */
public class TestElectronics {
	public static final int THINKPAD = 0;
	public static final int MOUSE = 1;
	public static final int KEYBOARD = 2;

	public static void main(String[] args) {
		ShopCar shopcar = new ShopCar();
		shopcar.add(new ThinkPad());
		shopcar.add(new Mouse());
		shopcar.add(new Keyboard());
		
		System.out.println("购物车中的电子产品数量：  " + shopcar.getSize());
		
		//测试ThinkPad
		ThinkPad thinkpad = (ThinkPad)shopcar.getListItem(THINKPAD);
		thinkpad.boot();
		thinkpad.progran();
		System.out.println("##################");
		
		Mouse mouse = (Mouse)shopcar.getListItem(MOUSE);
		mouse.move();
		mouse.onClick();
		System.out.println("##################");
		
		Keyboard keyboard = (Keyboard)shopcar.getListItem(KEYBOARD);
		keyboard.input();
		
	}
}
