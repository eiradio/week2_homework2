package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {

        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new LinkedList<>();
        for (Integer i : array){
            result.add(i * 3);
        }
        return result;

    }

    public List<String> mapLetter() {
        List<String> result = new LinkedList<>();
        for (Integer i : array){
            result.add(letters[i - 1]);
        }
        return result;

    }

    public List<String> mapLetters() {
        List<String> result = new LinkedList<>();
        for(int i=0; i<array.size(); i++){

            int currentElement = array.get(i);

            if(currentElement <= 26){
                result.add(letterList.get(currentElement-1));
            }else{

                int firstIndex = currentElement/26;
                int secondIndex = currentElement%26;

                if(secondIndex == 0){
                    secondIndex = 26;
                    firstIndex--;
                }

                String mapLetter = letterList.get(firstIndex-1) + letterList.get(secondIndex-1);
                result.add(mapLetter);
            }
        }

        return result;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array, Collections.reverseOrder());
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
