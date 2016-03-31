package br.com.semeru.dozer.converter;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerParser {

    private static final Mapper dozerMapper = new DozerBeanMapper();

    public static <O, D> D parseObjectInputToObjectOutput(O  originalObject, Class<D> destinationObject) {
        return parser(destinationObject, originalObject);
    }

    public static <O, D> List<D> parserListObjectInputToObjectOutput(List<O> originalObjects, Class<D> destinationObject) {
        List<D> destinationObjects = new ArrayList<D>();
        for (Object originalObject : originalObjects) {
            destinationObjects.add(parser(destinationObject, originalObject));
        }
        return destinationObjects;
    }

    private static <D> D parser(Class<D> destinationObject, Object originalObject) {
        return dozerMapper.map(originalObject, destinationObject);
    }
}
