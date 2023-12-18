public class Main {
    public static void main(String[] args) {
        // Ошибка возникает так, как значение b, используемое в Main в строке 14 равно 0, деление на 0 невозможно
        // Решить ошибку можно создав проверку, которая будет выбрасывать ошибку при попытке деления на 0
        //

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);


            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0!");
        }

    }
}