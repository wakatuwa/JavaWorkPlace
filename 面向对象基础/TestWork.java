package ObjectOrientedBasics;
/**
 * 
 * @author wanghan
 *
 */
public class TestWork {
    int x, y;
    TestWork(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        TestWork pt1, pt2;
        pt1 = new TestWork(3, 3);
        pt2 = new TestWork(4, 4);
        System.out.print(pt1.x + pt2.x);
    }
}

