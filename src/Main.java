import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Practise №1
        int[] array = {2, 3, 0, 8, -7, -8, -2, 0, 1, 2};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] == 0) {
                zeroCount++;

            }
        }
        System.out.println(" ");
        System.out.println("Positive:" + positiveCount);
        System.out.println("Negative:" + negativeCount);
        System.out.println("Zero:" + zeroCount);

        //Practise№2
        int[] nums = {1, 23, 4, -5, 404, 0, 8, 0};
        int mavVal = nums[0];
        int minVal = nums[0];
        int maxInd = 0;
        int minInd = 0;
        int i1;
        System.out.println("Array: ");
        for (i1 = 0; i1 < nums.length; i1++) {
            if (nums[i1] > mavVal) {
                mavVal = nums[i1];
                maxInd = i1;
            }
            if (nums[i1] < minVal) {
                minVal = nums[i1];
                minInd = i1;
            }


            System.out.print(nums[i1] + " ");
        }
        System.out.println(" ");
        System.out.println("Largest: " + mavVal);
        System.out.println("Smallest" + minVal);

//Practise№3
        int[] vals = {1,2,3,-5,0,-8};
        double sum=0;
        System.out.print("Arrays: ");
        for (int i=0;i<vals.length;i++){
            System.out.print(vals[i]+ " ");
            sum+=vals[i];
        }
        System.out.println(" ");
        double average=sum/vals.length;
        int count=0;
        for(int i=0;i<vals.length;i++){
            if(vals[i]>average){
                count++;
            }}
            System.out.println("Average: "+average);
            System.out.println("Numbers Above average: "+ count);
            //Practise 4
        int[] revNums={8,9,0,-7,93,0,-1};
        System.out.print("Original array: ");
        for (int i=0;i<revNums.length;i++) {
            System.out.print(revNums[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Reverse: ");
        for( int i=6;i>=0;i--){
            System.out.print(revNums[i] + " ");
        }

//Practise 5
        int[] emptyNumbers = new int[5];
        int passedCount=0;
        int failedCount=0;
        double sum1=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< emptyNumbers.length;i++) {
            System.out.println("Please enter your score");
            int score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Input error");
                i--;
            }
            else{
                emptyNumbers[i]=score;
            }}
        System.out.print("Scores: ");
        for(int i=0;i<emptyNumbers.length;i++) {
            System.out.print(emptyNumbers[i] + " ");
            sum1+=emptyNumbers[i];
            if (emptyNumbers[i]>=60){
                passedCount++;}
            else{
                failedCount++;}}
        System.out.println(" ");
        double average1=sum1/ emptyNumbers.length;
        System.out.println("Passed:"+passedCount);
        System.out.println("Failed:"+failedCount);
        System.out.println("Average: "+average1);








    }}