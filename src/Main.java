import interpreter.Interpreter;


public class Main {
    public static void main(String[] args) {
        testExpression();
    }

    public static void testExpression() {
        System.out.println(Interpreter.parse("1+2+3").interpret()); // 6
        System.out.println(Interpreter.parse("1+2+3-4").interpret()); // 2
        System.out.println(Interpreter.parse("10+2+3-4-5").interpret()); // 6
        System.out.println(Interpreter.parse("1 + 2 + 3 + 4").interpret()); // 10
    }
}