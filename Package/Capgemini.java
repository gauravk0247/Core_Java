// 1/11/2023
package hiring.it.fresher;
import training.it.skillset.CyberSuccess;
class Capgemini extends CyberSuccess{
	public static void main(String[] args){
		System.out.println("Start hiring");
		Capgemini cp1 = new Capgemini();
		cp1.java();
		cp1.python();
		cp1.testing();
		System.out.println("Stop hiring");
	}
}

// for compilation ---> javac -d . CyberSuccess.java
//						javac -d . Capgemini.java
//						java hiring.it.fresher.Capgemini