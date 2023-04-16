package time;

public class Singleton {
	
	private Singleton() {}
	
	private static Singleton instance;			
	
	
	public static Singleton getInstance() {		
		if(instance == null) {
			instance = new Singleton();			
		}
		return instance;
	}
	
	
	
	// 멤버변수와 메서드
	private String str;
	public String getStr() {return str;}
	public void setStr(String str) {this.str = str;}
}
