package com.mipt.ami.java.task.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountingInvocationHandler implements InvocationHandler {

    private final Map<String, Integer> counter = new HashMap<>();
    private final Object targetObject;

    public CountingInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;


    }

    public Map<String, Integer> countOf(String methodName) {
        Map<String, Integer> result = counter.entrySet().stream()
                .filter(e -> e.getKey().startsWith(methodName + "["))
                .filter(e -> e.getValue() != 0)
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        
        return result;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object resultOfInvocation = method.invoke(targetObject, args);

        return resultOfInvocation;
    }
}
