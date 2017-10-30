package io.zipcoder.microlabs.arrays;


import java.lang.reflect.Array;
import java.util.*;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String answer = "*** Output ***";
            for(String words: inputArray){
            answer += "\n" + words;
                }
        return answer;
    }

    public String lastElement(String[] inputArray){
        int answerPosition = inputArray.length;
        String answer = inputArray[answerPosition -1];
        return answer;
    }

    public String lastButOne(String[] inputArray){
        int answerPosition = inputArray.length;
        String answer = inputArray[answerPosition -2];
        return answer;
    }

    public String reverse(String[] inputArray){
        String answer = "*** Output ***";
        int lastWord = inputArray.length - 1;
        for(int i = lastWord; i >= 0; i--){
            answer += "\n" + inputArray[i];
        }
        return answer;
    }

    public boolean isPalindrome(String[] inputArray) {
        String answer = "";
        int lastWord = inputArray.length - 1;
        for (int i = lastWord; i >= 0; i--) {
            answer += "\n" + inputArray[i];
            if (inputArray.equals(answer)) {
                return true;
            }
        }
        return false;
    }

    public String compress(Integer[] inputArray){
        String answer = "*** Output ***";
        for (int i = 0; i < inputArray.length-1; i++) {
            if(!(inputArray[i].equals(inputArray[i+1]))){
                answer += "\n" + inputArray[i];
            }
        } if(inputArray[inputArray.length - 1].equals(inputArray[inputArray.length - 2])){
            answer += "\n" + inputArray[inputArray.length - 1];
        }
        return answer;
    }

    public String pack(Character[] inputArray){
        String answer = "*** Output ***\n" + inputArray[0];
        for(int i = 1; i < inputArray.length; i++)
            if(inputArray[i].equals(inputArray[i-1]))
            { answer += inputArray[i];
            } else {
            answer += ", " + inputArray[i];
            }
        return answer;
    }
    //TODO Define the method lastButOne

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
