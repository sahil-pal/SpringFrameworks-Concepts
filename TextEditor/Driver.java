package TextEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_Editor.xml");
		
		editor e = (editor) context.getBean("editor");
		
		System.out.println(e.getEditor());
		System.out.println(e.getCheck());
		
		// closing the resources
		((ClassPathXmlApplicationContext) context).close();
				
	}
}
