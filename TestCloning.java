package dp.prototype;

public class TestCloning {
	public static void main(String[] args) {
		CloneFactory fleshPool = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSheep = (Sheep) fleshPool.getClone(sally);
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
		System.out.println("Sally Hashcode: " + System.identityHashCode(clonedSheep));
	}
}
