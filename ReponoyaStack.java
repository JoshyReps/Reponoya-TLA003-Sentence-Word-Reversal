package com.mycompany.reponoyastack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReponoyaStack {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        System.out.print("Enter a Word or Sentence : ");
        stack.addAll(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
        
        //split explaintion : the reason why we need to use the split method is we are only asking for one input which are eiter a word or an entire string byitself. Hence, if we do input a sentence we want to extract 
        //the individual words in that String and reverse its order
        
        
        System.out.print("Reverse Stack : ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
