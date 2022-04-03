import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int tmp;
int N = scnr.nextInt();
int[] numbers = new int[N];
int minidx = 0;
int minval = Integer.MAX_VALUE;

for(int i = 0;i < numbers. length; i++){
numbers[i] = scnr.nextInt();
}

for (int i = 0; i < numbers. length; i++){
    if(minval > numbers[i]){
    minval = numbers[i];
    minidx = i;
    }
    }
tmp = numbers[0];
numbers[0] = numbers[minidx];
numbers[minidx] = tmp;

for (int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");
}
System.out.println();

 minval = Integer.MAX_VALUE;
for (int i = 1; i < numbers. length; i++){
if(minval > numbers[i]){
minval = numbers[i];
minidx = i;
}
}
tmp = numbers[1];
numbers[1] = numbers[minidx];
numbers[minidx] = tmp;

for (int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");
}
System.out.println();

 minval = Integer.MAX_VALUE;
for (int i = 2; i < numbers.length; i++){
if(minval > numbers[i]){
minval = numbers[i];
minidx = i;
}
}
tmp = numbers[2];
numbers[2] = numbers[minidx];
numbers[minidx] = tmp;

for (int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");
}
System.out.println();

 minval = Integer.MAX_VALUE;
for (int i = 3; i < numbers.length; i++){
if(minval > numbers[i]){
minval = numbers[i];
minidx = i;
}
}
tmp = numbers[3];
numbers[3] = numbers[minidx];
numbers[minidx] = tmp;

for (int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");
}
System.out.println();

 minval = Integer.MAX_VALUE;
for (int i = 4; i < numbers.length; i++){
if(minval > numbers[i]){
minval = numbers[i];
minidx = i;
}
}
tmp = numbers[4];
numbers[4] = numbers[minidx];
numbers[minidx] = tmp;

for (int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");
}


}}


