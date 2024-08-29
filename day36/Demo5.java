package day36;
//if interface is not there u cant make it work on multiple browser

//Architect
interface Browser {
	void openBrowser();

	void maximizeBrowser();

	void enterUrl(String url);

	void closeBrowser();
}



class Chrome implements Browser {

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");

	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Maximise chrome Browser");

	}

	@Override
	public void enterUrl(String url) {
		System.out.println("Enter url in Chrome Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("close chrome Browser");

	}

}

class Firefox implements Browser {

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Browser");
		
	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Maximise Firefox Browser");
		
	}

	@Override
	public void enterUrl(String url) {
		System.out.println("Enter url in Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Enter url in Firefox Browser");
		
	}
	
	
}


class AutomationScript {
	static void testRun(Browser c) { //instead of creating firefox or chrome object 
		//create Browser object
		c.openBrowser();
		c.maximizeBrowser();
		c.enterUrl("fb.com");
		c.closeBrowser();

	}

}

public class Demo5 {
	public static void main(String[] args) {
		Browser c=new Chrome();
		AutomationScript.testRun(c);//AutoUpcasting
		
		System.out.println("--------------");
		
		Browser f=new Firefox();
		AutomationScript.testRun(f);

	}

}
