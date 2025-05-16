package com.mycompany.reponoyastack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReponoyaStack {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        System.out.print("Enter a Word or Sentence : ");
        stack.addAll(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
        
        System.out.print("Reverse Stack : ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
