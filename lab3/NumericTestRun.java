package lab3;

public class NumericTestRun
{
	public static void main(String[] args)
	{
		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isNegative = (n) -> (n < 0);
		System.out.println(isEven.computeTest(5));
		System.out.println(isNegative.computeTest(-5));
		System.out.println(NumericTest.sum(3, 5));
		System.out.println(NumericTest.multiply(3, 5));

		MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
		MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";

		System.out.println(morningGreeting.processName("Harrold"));
		System.out.println(eveningGreeting.processName("Kumar"));
	}
}
