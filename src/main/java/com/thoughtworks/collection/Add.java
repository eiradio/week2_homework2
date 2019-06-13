package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder){
            int tem = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tem;
        }
        int result = 0;
        for (int i = leftBorder % 2 == 0 ? leftBorder : leftBorder + 1; i <= rightBorder;i += 2){
            result += i;
        }
        return result;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder){
            int tem = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tem;
        }
        int result = 0;
        for (int i = leftBorder % 2 != 0 ? leftBorder : leftBorder + 1; i <= rightBorder;i += 2){
            result += i;
        }
        return result;


    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (Integer i : arrayList){
            result += i;
        }
        result = result * 3 + 2 * arrayList.size();

        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        result.addAll(arrayList);
        int size = result.size();
        for (int i = 0; i < size;i++){
            if (result.get(i) % 2 != 0){
                result.set(i, result.get(i) * 3 + 2);

            }
        }

        return result;


    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (Integer i : arrayList){
            if (i % 2 != 0){
                result += i * 3 + 5;
            }
        }
        return result;

    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double result = 0;
        List<Integer> tempList = new LinkedList<>();
        for (Integer i : arrayList){
            if (i % 2 == 0){
                tempList.add(i);
            }
        }

        Collections.sort(tempList);
        int size = tempList.size();
        if (size % 2 != 0){
            result = tempList.get(size / 2);
        }
        else {
            result = (tempList.get(size / 2) + tempList.get(size / 2 - 1)) / 2;
        }

        return result;

    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        for (Integer i : arrayList){
            if (i % 2 == 0){
                sum += i;
                count += 1;
            }
        }

        return sum / count;


    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (specialElment % 2 != 0) return false;
        return arrayList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : arrayList){
            if (i % 2 == 0){
                result.add(i);
            }
        }
        return new ArrayList<>(result);
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new LinkedList<>();
        List<Integer> oddList = new LinkedList<>();
        for (Integer i : arrayList){
            if (i % 2 == 0){
                evenList.add(i);
            }
            else {
                oddList.add(i);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        evenList.addAll(oddList);

        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new LinkedList<>();
        int size = arrayList.size() - 1;
        for (int i = 0;i < size;i++){
            result.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return result;

    }
}
