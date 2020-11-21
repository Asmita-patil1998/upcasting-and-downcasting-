
package QUE_2;
class Animal{
	void makeSound(){
		
	}

}
class Dog extends Animal{
    void makeSound() {
    	System.out.println("in makesound method of dog class");
    }
    
}

class Cat extends Animal{
	void makeSound() {
    	System.out.println("in makesound method of cat class");
    }
}
class Tiger extends Animal{
	void makeSound() {
    	System.out.println("in makesound method of Tiger class");
}
	void Hunting() {
    	System.out.println("in hunting method of Tiger class");
}	
}

public class Deno2 {

	static void perform(Animal ref){
		ref.makeSound();
		
		if(ref instanceof Tiger) {
			
			Tiger ob =(Tiger)ref;
			ob.Hunting();
		}
	}

	public static void main(String[] args) {
		perform(new Cat());
		perform(new Dog());
		perform(new Tiger());
		
		
	}

}
