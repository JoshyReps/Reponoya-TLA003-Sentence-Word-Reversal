package com.mycompany.reponoyastack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReponoyaStack {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        System.out.print("Enter a Word or Sentence : ");
        stack.addAll(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
        
        //split explaintion : the reason why we need to use the split method is becuase we want each words in a sentence or a given string to be separated from the ntire string itself.
        //hence we want to extract all the words from a given String and manually change their order in a reverse way using a stack.
        //Without split, it's hard to find a way to figure out which are the words in a given String
        
        
        System.out.print("Reverse Stack : ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
