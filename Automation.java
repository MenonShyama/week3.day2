package week3.day2;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation au = new Automation();
		au.java();
		au.selenium();
		au.python();
		au.ruby();

	}

	public void java() {
		System.out.println("java method was in interace Language class");

	}

	public void selenium() {
		System.out.println("selenium method was in interace Testtool class");

	}

	@Override
	public void ruby() {
		System.out.println("ruby method is in abstract multiple language class");

	}

}
