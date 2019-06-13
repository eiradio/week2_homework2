package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int result = arrayList.get(0);
        for (Integer i : arrayList){
            if (i > result) result = i;
        }
        return result;
    }

    public double getMinimum() {

        int result = arrayList.get(0);
        for (Integer i : arrayList){
            if (i < result) result = i;
        }
        return result;    }

    public double getAverage() {
        int sum = 0;
        for (Integer i : arrayList){
            sum += i;
        }

        return (double)sum / arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> temp = new ArrayList<>();
        temp.addAll(arrayList);
        Collections.sort(temp);
        int size = temp.size();
        if (size % 2 == 0){
            return (temp.get(size / 2) + temp.get(size / 2 - 1)) / 2.0;
        }
        else {
            return temp.get(size / 2);
        }


    }

    public int getFirstEven() {
        for (Integer i : arrayList){
            if (i % 2 == 0) return i;
        }
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        int size = arrayList.size();
        for (int i = 0;i < size;i++){
            if (arrayList.get(i) % 2 == 0){
                return i;
            }
        }
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()) return false;
        int size = this.arrayList.size();
        for(int i = 0;i < size;i++){
            if (this.arrayList.get(i) != arrayList.get(i)) return false;
        }

        return true;
    }

    public double getMedianInLinkList(SingleLink<Integer> singleLink) {
        int index = arrayList.size() / 2;

        if (arrayList.size() % 2 == 0){
            return (singleLink.getNode(index) + singleLink.getNode(index+1)) / 2.0;
        }
        else {
            return singleLink.getNode(index+1);
        }
    }

    public int getLastOdd() {
        int size = arrayList.size();
        for (int i = size - 1;i >= 0;i--){
            if (arrayList.get(i) % 2 != 0) {
                return arrayList.get(i);
            }
        }
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        int size = arrayList.size();
        for (int i = size - 1;i >= 0;i--){
            if (arrayList.get(i) % 2 != 0) {
                return i;
            }
        }
        throw new NotImplementedException();
    }
}
