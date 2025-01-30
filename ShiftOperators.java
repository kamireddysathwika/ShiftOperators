public class ShiftOperators {
 public static void main(String[] args) {
        int num = 8; 
        int leftShift = num << 2;  
        int rightShift = num >> 2; 
        System.out.println("Original number: " + num);
        System.out.println("Binary representation of " + num + ": " + Integer.toBinaryString(num));

        System.out.println("\nLeft shift by 2: " + leftShift);
        System.out.println("Binary representation after left shift: " + Integer.toBinaryString(leftShift));

        System.out.println("\nRight shift by 2: " + rightShift);
        System.out.println("Binary representation after right shift: " + Integer.toBinaryString(rightShift));
    }
}
