package ObjectOrientedAdvanced;
/**
 * 测试向下转型
 * @author wanghan
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ShopCar {
	private List<Electronics> mlist = new ArrayList<Electronics>();
	public void add(Electronics electronics) {
		mlist.add(electronics);
	}
	public int getSize() {
		return mlist.size();
	}
	public Electronics getListItem(int position) {
		return mlist.get(position);
	}
}
