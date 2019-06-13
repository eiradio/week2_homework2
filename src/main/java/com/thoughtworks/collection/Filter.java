package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new LinkedList<>();
        for (Integer i : array){
            if (i % 2 == 0){
                result.add(i);
            }
        }
        return result;

    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new LinkedList<>();
        for (Integer i : array){
            if (i % 3 == 0){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        result.addAll(firstList);
        result.retainAll(secondList);
        return result;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> set = new HashSet<>();
        set.addAll(array);
        List<Integer> result = new ArrayList<>();
        result.addAll(set);
        return result;
    }
}