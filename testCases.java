import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class testCases {
		
	@Test
	void test1()
	{
		VendingMachine vm = new VendingMachine();
		Integer input = 35;
		Integer cost = 20;
		String output = vm.dispenseItem(input, "candy");
		String ans = "Item dispensed and change of " + Integer.toString(input-cost) + " returned";
		assertEquals(output, ans);		
	}
	
	@Test
	void test2()
	{
		Integer input = 25;
		//Integer cost = 25;
		String output = VendingMachine.dispenseItem(input, "coke");
		String ans = "Item dispensed.";
		assertEquals(output, ans);		
	}
	
	@Test
	void test3()
	{
		Integer input = 35;
		Integer cost = 45;
		String output = VendingMachine.dispenseItem(input, "coffee");
		String ans = "Item not dispensed, missing " + Integer.toString(cost-input) + " cents. Can purchase candy or coke.";
		assertEquals(output, ans);		
	}
	
	@Test
	void test4()
	{
		Integer input = 22;
		Integer cost = 45;
		String output = VendingMachine.dispenseItem(input, "coffee");
		String ans = "Item not dispensed, missing " + Integer.toString(cost-input) + " cents. Can purchase candy.";
		assertEquals(output, ans);		
	}
	
	@Test
	void test5()
	{
		Integer input = 15;
		Integer cost = 45;
		String output = VendingMachine.dispenseItem(input, "coffee");
		String ans = "Item not dispensed, missing " + Integer.toString(cost-input) + " cents. Cannot purchase item.";
		assertEquals(output, ans);		
	}
}
