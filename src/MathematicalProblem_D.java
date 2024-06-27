import java.util.*;

public class  MathematicalProblem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            int[] arr = new int[n];
            String s= sc.next();
            int cnt=0;
            for(int j=0; j<n; j++){
                int num = Integer.parseInt(String.valueOf(s.charAt(j)));
                if(num==0){
                    cnt++;
                }
                arr[j] = num;
            }

            //2 numbers case
            if(n==2){
                System.out.println(s);
            }

            //3 numbers case
            if(n==3){
                if(arr[0]==0 || arr[2]==0){
                    System.out.println("0");
                } else {

                }
            }

            //number of digits greater than 3 and it contains 2 zeros
            if(n>3 && cnt>1){
                System.out.println("0");
            } else if (arr[0]==0 || arr[n-1]==0){
                System.out.println("0");
            } else {
                int minNum=Integer.MAX_VALUE;
                int minNumLoc=20;
                for(int j=0; j<n-1; j++){
                    if(arr[j]<minNum){
                        minNum=arr[j];
                        minNumLoc=j;
                    }
                }
                int newNum=(minNum*10)+arr[minNumLoc+1];
                int arr1[]=new int[n-1];
                for(int j=0; j<n-1; j++){
                    if(j<minNumLoc) {
                        arr1[j] = arr[j];
                    }
                    if(j==minNumLoc){
                        arr1[j]=newNum;
                    }
                    if(j>minNumLoc){
                        arr1[j] = arr[j+1];
                    }
                }

            }

        }
    }
}
