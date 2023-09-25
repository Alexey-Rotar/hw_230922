// Задание 2
// Решение:

try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
    System.out.println("Catching exception: " + e);
}



// Задание 3
// Решение:

public static void main(String[] args) {
    try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
    } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
    }
}

public static void printSum(Integer a, Integer b) throws NullPointerException {
   if (a == null | b == null)
        throw new NullPointerException();
   System.out.println(a + b);
}


