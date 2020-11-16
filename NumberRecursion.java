public class NumberRecursion {

    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else{
            System.out.print(number % 10);
            reverseMethod(number / 10);
        }
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println("Number is" + num);
        System.out.print("Reverse of input number is:");
        reverseMethod(num);
        System.out.println();
    }
}
