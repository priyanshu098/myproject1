package inheritjava;

public class Inheritance1 {
	interface Swimmer {
	    void swim();
	}

	interface Flyer {
	    void fly();
	}

	class Bird implements Swimmer, Flyer {
	    @Override
	    public void swim() {
	        System.out.println("Bird is swimming.");
	    }

	    @Override
	    public void fly() {
	        System.out.println("Bird is flying.");
	    }
	}

	public class MultipleInheritanceDemo {
	    public void main(String[] args) {
	        Bird bird = new Bird();
	        bird.swim(); // Method from Swimmer interface
	        bird.fly();  // Method from Flyer interface
	    }
	}

}
