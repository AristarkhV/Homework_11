package mateacademy.homework.homework_11;

public class ClassCall {

    private static void call() {
        System.out.println(GetCallerClassAndMethodName.getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        call();
    }
}