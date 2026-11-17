package q1;

public class Main {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(12);
        MyInteger n2 = new MyInteger(13);
        MyInteger n3 = new MyInteger(17);

        System.out.println("n1 value: " + n1.getValue());
        System.out.println("n1 isEven(): " + n1.isEven());
        System.out.println("n2 isOdd(): " + n2.isOdd());
        System.out.println("n3 isPrime(): " + n3.isPrime());

        System.out.println("MyInteger.isEven(10): " + MyInteger.isEven(10));
        System.out.println("MyInteger.isOdd(11): " + MyInteger.isOdd(11));
        System.out.println("MyInteger.isPrime(19): " + MyInteger.isPrime(19));
        System.out.println("MyInteger.isEven(new MyInteger(8)): " + MyInteger.isEven(new MyInteger(8)));
        System.out.println("MyInteger.isOdd(new MyInteger(9)): " + MyInteger.isOdd(new MyInteger(9)));
        System.out.println("MyInteger.isPrime(new MyInteger(23)): " + MyInteger.isPrime(new MyInteger(23)));

        System.out.println("n1.equals(12): " + n1.equals(12));
        System.out.println("n1.equals(new MyInteger(12)): " + n1.equals(new MyInteger(12)));

        char[] digits = {'1', '2', '3', '4'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(digits));
        System.out.println("parseInt(String): " + MyInteger.parseInt("456"));
    }
}

