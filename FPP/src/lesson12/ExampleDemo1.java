package lesson12;
public class ExampleDemo1 {
public static void main(String[] args) {
int nums[] = new int[4];
try {
//1
System.out.println("Before exception is generated.");
// Generate an index out-of-bounds exception.
//2
nums[4] = 10;
//3
System.out.println("End of try");
}
catch (ArrayIndexOutOfBoundsException exc) {
// catch the exception
//4
System.out.println("Index out-of-bounds!");
}
finally
{
//5
System.out.println("End of try catch block");
}
 }
}