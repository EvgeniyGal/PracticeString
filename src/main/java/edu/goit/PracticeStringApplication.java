package edu.goit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class PracticeStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeStringApplication.class, args);


	}

	@Bean
	public CommandLineRunner commandLineRunnerBean(List<ITest> test){
		return (args) -> {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			test.forEach(ITest::print);
		};
	}

//	@Bean
//	public ITest createTest(){
//		return new Test1();
//	}


}

@Component
class Test1 implements ITest{
	public void print(){
		System.out.println("Test-1");
	}
}

@Component
class Test2 implements ITest{
	public void print(){
		System.out.println("Test-2");
	}
}

interface ITest{
	public void print();
}
