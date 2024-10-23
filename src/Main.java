import interpreter.Interpreter;
import memento.TextEditorMemento;


public class Main {
    public static void main(String[] args) {
//        testExpression();
        testMemento();
    }

    public static void testExpression() {
        System.out.println(Interpreter.parse("1+2+3").interpret()); // 6
        System.out.println(Interpreter.parse("1+2+3-4").interpret()); // 2
        System.out.println(Interpreter.parse("10+2+3-4-5").interpret()); // 6
        System.out.println(Interpreter.parse("1 + 2 + 3 + 4").interpret()); // 10
    }

    public static void testMemento() {
        TextEditorMemento editor = new TextEditorMemento();

        editor.addText("Hello");
        editor.save();
        System.out.println(editor.getText()); // Hello

        editor.addText(" World");
        editor.save();
        System.out.println(editor.getText()); // Hello World

        editor.addText("!");
        editor.save();
        System.out.println(editor.getText()); // Hello World!

        editor.restore();
        System.out.println(editor.getText()); // Hello World!

        editor.restore();
        System.out.println(editor.getText()); // Hello World

        editor.restore();
        System.out.println(editor.getText()); // Hello

        editor.restore();
        System.out.println(editor.getText()); //


    }
}