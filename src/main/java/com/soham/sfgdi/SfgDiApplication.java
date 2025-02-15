package com.soham.sfgdi;

import com.soham.sfgdi.controllers.ConstructorController;
import com.soham.sfgdi.controllers.LangController;
import com.soham.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		LangController langController = (LangController) ctx.getBean("langController");

		System.out.println(langController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println(greetings);

		System.out.println("--------");

		ConstructorController constructorController= (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());
	}

}
