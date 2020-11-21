package QUE_1;
class course {
	void start(){
		
	}
	void stop() {

		
	}
}
class Dac extends course{
    void start() {
    	System.out.println("DAC course is started");
    }
    void stop() {
    	System.out.println("DAC course is stopped");
    }
    void orientation() {
    	System.out.println("orientation session by vikram sir");
    }
}

class dbda extends course{
	void start() {
    	System.out.println("DBDA course is started");
    }
    void stop() {
    	System.out.println("DBDA course is stopped");
    }
}
public class Demo1 {

	static void perform(course ref){
		ref.start();
		ref.stop();
		
		if(ref instanceof Dac) {
			Dac ob =(Dac)ref;
			ob.orientation();
		}
	
	}

	public static void main(String[] args) {
		perform(new Dac());
		perform(new dbda());
		
	}

}
