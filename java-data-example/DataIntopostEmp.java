import java.io.IOException;

public class DataIntopostEmp {
    private Stack theStack;
    private String input;
    private String output = "";
    public DataIntopostEmp(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    public void gotOper(char opThis, int perc1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }

                if (prec2 > perc1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
            theStack.push(opThis);
        }
    }


    public String doTrans() {
        for (int j = 0; j < input.length(); ++j) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        String input = "1+2*3/5-7+3/6";
        String output;
        DataIntopostEmp theTrans = new DataIntopostEmp(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output);
    }
}

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char i) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}