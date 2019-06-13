package com.thoughtworks.collection;



import java.util.*;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new LinkedList<>();
        for(Integer[] list : array){
            for (Integer i : list){
                result.add(i);
            }
        }

        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for(Integer[] list : array){
            for (Integer i : list){
                if (!result.contains(i)) result.add(i);
            }
        }

        return result;

    }
}
