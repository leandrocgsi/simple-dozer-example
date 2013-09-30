package br.com.semeru.dozer.converter;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.semeru.dozer.mocks.InputObject;
import br.com.semeru.dozer.mocks.OutputObject;

public class DozerParserTest {
		
	InputObject inputObject;
	
	@Before
	public void setUp() {
		inputObject = new InputObject();
	}
	
	@Test
	public void parseOgreInputToOgreOutputTest(){
		OutputObject output = DozerParser.parseObjectInputToObjectOutput(mockInput(), OutputObject.class);
		Assert.assertEquals("Name Test", output.getName());
		Assert.assertTrue(output.getAge() == 21);
	}
	
	@Test
	public void parserListOgreInputToOgreOutputTest(){
		List<OutputObject> output = DozerParser.parserListObjectInputToObjectOutput(mockInputList(), OutputObject.class); 
		Assert.assertEquals("Name Test 2", output.get(0).getName());
		Assert.assertTrue(output.get(0).getAge() == 22);
	}

	private InputObject mockInput() {
		inputObject.setName("Name Test");
		inputObject.setAge(21);
		return inputObject;
	}
	
	private List<InputObject> mockInputList() {
		List<InputObject> inputObjects = new ArrayList<InputObject>();
		for (int i = 0; i < 3; i++) {
			inputObjects.add(mockInput(i));
		}
		return inputObjects;
	}

	private InputObject mockInput(Integer number) {
		inputObject.setName("Name Test " + number);
		inputObject.setAge(20 + number);
		return inputObject;
	}
}
