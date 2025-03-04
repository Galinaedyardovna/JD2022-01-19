package by.it.burov.jd01_12;

import java.util.Scanner;
import java.util.Stack;

    public class TaskC3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(bracketControl(scan.nextLine()));
    }

        public static boolean bracketControl(String s) {
            Stack<Character> stack  = new Stack<Character>();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '[' || c == '(' || c == '{' ) {
                    stack.push(c);
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
