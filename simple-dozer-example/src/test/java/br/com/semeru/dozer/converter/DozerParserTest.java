package br.com.semeru.dozer.converter;

import br.com.semeru.dozer.mocks.MockInputObject;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.semeru.dozer.objects.OutputObject;

public class DozerParserTest {

    MockInputObject inputObject;

    @Before
    public void setUp() {
        inputObject = new MockInputObject();
    }

    @Test
    public void parseObjectInputToObjectOutputTest() {
        OutputObject output = DozerParser.parseObjectInputToObjectOutput(inputObject.mockInput(), OutputObject.class);
        Assert.assertEquals("Name Test", output.getName());
        Assert.assertEquals("Old City", output.getAddress().getTown());
        Assert.assertTrue(output.getAge() == 21);
    }

    @Test
    public void parserListObjectInputToObjectOutputTest() {
        List<OutputObject> output = DozerParser.parserListObjectInputToObjectOutput(inputObject.mockInputList(), OutputObject.class);
        Assert.assertEquals("Name Test 2", output.get(0).getName());
        Assert.assertEquals("Old City", output.get(0).getAddress().getTown());
        Assert.assertTrue(output.get(0).getAge() == 22);
    }
}
