package dp.prototype;

public class CloneFactory {
	public Animal getClone(Animal animalSample) {
		return animalSample.makeClone();
	}
}
