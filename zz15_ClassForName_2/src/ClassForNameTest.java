import java.lang.reflect.Constructor;

import com.sun.jdi.Field;
import com.sun.jdi.Method;

public class ClassForNameTest {

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class strClass = Class.forName("MyBook");
		
		Constructor[] cons = strClass.getConstructor();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println("---------------------");
		Field[] fields = strClass.getFileds();
		for (Filed f : fileds) {
			System.out.println("-------------------------");
		}
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
