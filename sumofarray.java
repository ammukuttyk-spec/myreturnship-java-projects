//Sum of Array Elements
class Main{
    public static void main(String[] args) {
        int[] numbers={20,10,30,50,60};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}