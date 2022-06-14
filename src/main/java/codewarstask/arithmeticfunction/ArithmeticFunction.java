package codewarstask.arithmeticfunction;

public class ArithmeticFunction {

    public static int arithmetic(int a, int b, String operator) {

        switch (operator) {
            case "subtract":
                return a-b;
            case "add":
                return a+b;
            case "multiply":
                return a*b;
            case "divide":
                return a/b;
        }
            return -1;
    }

}
