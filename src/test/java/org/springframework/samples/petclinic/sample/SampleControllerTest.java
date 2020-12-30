package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleControllerTest {
	// SampleControllerTest SampleController(생성자?)에 의존성을 주입한다.

	@Test
	public void testDoSomething()
	{
		SampleRepository sampleRepository =  new SampleRepository();
		SampleController sampleController = new SampleController(sampleRepository);
		// 이미 생성자를 통해 sampleRepository가 만들어져서
		// doSomething메소드(sampleRepository.save()실행)를 실행해도 NullPtr exception이 발생하지 않는다.
		sampleController.doSomething();
	}
}
