package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new LinkedList<>();
        int step = left < right ? 1 : -1;
        for (int i = left; i != right;i += step){
            result.add(i);
        }
        result.add(right);

        return result;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new LinkedList<>();
        int step = left < right ? 1 : -1;
        if (left % 2 != 0) left += step;
        if (right % 2 != 0) right -= step;
        step *= 2;
        for (int i = left; i != right;i += step){
            result.add(i);
        }
        result.add(right);

        return result;

    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new LinkedList<>();
        for (int i : array){
            if (i % 2 == 0){
                result.add(i);
            }
        }
        return result;

    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstList = Arrays.stream( firstArray ).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream( secondArray ).boxed().collect(Collectors.toList());

        firstList.retainAll(secondList);

        return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(secondArray));
        secondList.removeAll(firstList);
        firstList.addAll(secondList);
        return firstList;
    }
}
