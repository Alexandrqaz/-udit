import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
public class TestTest {
	
	public TestTest() {

	}
	@Before

	public void setUp() {
		
	}

	@After

	public void tearDown() {

	}
	@Test
	public void testTest1() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Малый ущерб";
		String b = "Очень низкий";
		String c = "Низкий риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest2() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "";
		String b = "";
		String c = null;
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest3() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Малый ущерб";
		String b = "Очень высокий";
		String c = "Средний риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest4() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Умеренный ущерб";
		String b = "Высокий";
		String c = "Средний риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest5() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Ущерб средней тяжести";
		String b = "Низкий";
		String c = "Средний риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest6() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Ущерб средней тяжести";
		String b = "Очень высокий";
		String c = "Высокий риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest7() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Большой ущерб";
		String b = "Очень высокий";
		String c = "Высокий риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testTest8() {
		risk_level_of_information_security Test3= new risk_level_of_information_security();
		String a = "Критический ущерб";
		String b = "Высокий";
		String c = "Высокий риск";
		boolean expResult = true;
		boolean  result = false;
		String c2 =Test3.level(a,b);
		if (c==c2)  result=true;
		assertEquals(expResult, result);
		}
	@Test
	public void testMain() {
		String[] args = null;
		 Interface Inter= new Interface();
		 Inter.main(args);
		}
}
