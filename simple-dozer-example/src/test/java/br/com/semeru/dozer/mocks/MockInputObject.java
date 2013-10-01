package br.com.semeru.dozer.mocks;

import br.com.semeru.dozer.objects.InputObject;
import java.util.ArrayList;
import java.util.List;

public class MockInputObject {

    private InputObject inputObject = new InputObject();

    public InputObject mockInput() {
        inputObject.setName("Name Test");
        inputObject.setAge(21);
        return inputObject;
    }

    public List<InputObject> mockInputList() {
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
