package Star;
import java.util.Scanner;
import java.util.Arrays;
public class Array{
     public static void main(String[] args){
        Scanner keep = new Scanner(System.in);

        int [] arr0 = {2,5,6,4};
        System.out.println(arr0[3]);
        System.out.println(arr0[0]);
        System.out.println(arr0[2]);

     int [] array = {3,5,6,43,7,8,9};
     int size0;
     size0 = array.length;

     for(int i = 0 ;i<size0;i++){
          System.out.println(array[i]);
     }


     // SUM OF THE ELEMENTS OF ARRAY
     int [] arr1 = {4,59,6,34,90,76};
     int size1,sum=0;
     size1 = arr1.length;

     for(int i =0;i<size1;i++){
          sum = sum + arr1[i];
     }
     System.out.println(sum);



 // MULTIPLY THE ELEMENTS OF ARRAY    
     int [] arr2 = {2,5,6,4,1,1};
     int size2,mul=1;
     size2 = arr2.length;

     for(int i =0;i<size2;i++){
     mul = mul * arr2[i];
     }
     System.out.println(mul);

// TO FIND THE MAXIMUM ELEMENT IN ARRAY
     int [] arr3 = {2,4,5,6,3,9};

     int size3 = arr3.length;
     int max = arr3[0];
     for(int i = 0;i<size3; i++){
          if(max<=arr3[i]){
               max = arr3[i];
          }
     }
     System.out.println(max);


// TO FIND THE MINIMUM ELEMENT IN ARRAY
     int [] arr4 = {2,4,5,6,3,-8,9};

     int size4 = arr4.length;
     int min = arr4[0];
     for(int i = 0;i<size4; i++){
          if(min>=arr4[i]){
               min = arr4[i];
          }
     }
     System.out.println(min);


// TO DO THE SUM OF TWO ARRAYS
     int []array1={2,4,5,6};
     int []array2 = {5,7,5,4};
     int sizeee;
     sizeee = array1.length;
     int []arrNew = new int [sizeee];
     

     for(int i=0;i<sizeee;i++){
          arrNew[i] = array1[i] + array2[i];
     }

     for(int m=0;m<sizeee;m++){
          System.out.println(arrNew[m]);
     }


// TO REVERSE THE ARRAY
     int [] arr5 = {3,5,4,6,8};
     
     int size6 = arr5.length;
     int []arr6 = new int[size6];

     for(int i=0;i<size6;i++){
          arr6[i] = arr5[size6 - 1 - i];
     }

     for(int m=0;m<size6;m++){
          System.out.printf("%d\t",arr6[m]);
     }


// TO CHECK TH NUMBER OF ELEMENT POSITIVE NEGATIVE OR ZERO IN ARRAY     
     int []arr7 = {3,0,4,-5,-8,-9,0,0};
     int size7 = arr7.length;

     int countP = 0,countN = 0,countZ = 0;
     
     for(int i=0;i<size7;i++){
          if(arr7[i] > 0){
               countP++;
          }else if(arr7[i] < 0){
               countN++;

          }else{
               countZ++;
          }
     }

     System.out.println("positive are " + countP);
     System.out.println("negative " + countN);
     System.out.println("zeroes are " + countZ);



// SWAPPING OF TWO ARRAY     
     int [] arr8 = {4,5,6,8};
     int [] arr9 = {5,99,76,54};

     int size8 = arr8.length,temp;

     for(int i=0;i<size8;i++){
          temp = arr8[i];
          arr8[i] = arr9[i];
          arr9[i] = temp;

     }
     for(int m=0;m<size8;m++){
          System.out.printf("array 1 is now %d \t",arr8[m]);
     }
     System.out.printf("\n");
     for(int n=0;n<size8;n++){
          System.out.printf(" array 2 is %d \t",arr9[n]);
     }



 // TO CHECK HOW MANY ELEMENTS ARE GREATER THAN THE USER ENTERED NUMBER    
     int []arr10 = {2,5,6,4,3,9};
     int size10;
     size10 = arr10.length;

     int x,count=0;
     System.out.println("enter x ");
     x = keep.nextInt();
      for(int i=0;i<size10;i++){
           if(x<=arr10[i]){
               count++;
           }
      }
      System.out.println("number of elements greater than x is " + count);



// DIFFERENCE BETWEEN THE SUM OF ELEMENTS OF EVEN INDIXED TO ODD INDIXED IN ARRAY       
     int []arr11 = {89,5,4,2,6,78,9};
     int size11;
     size11 = arr11.length;
     int sumE = 0,sumO = 0,diff;


     for(int i=0;i<size11;i++){
          if(i%2==0){
               sumE = sumE + arr11[i];
          }else{
               sumO = sumO + arr11[i];
          }
     }
      diff = sumE - sumO;
      System.out.println("difference is " + diff);


// CHANGE THE VALUE OF ODD INDIXED ELEMENTS TO ITS SECOND MULTIPLE AND INCREMENT ALL EVEN INDEXED VALUE BY 10      
     int [] arr12 = {3,5,4,7,8,6};
     int size12;
     size12 = arr12.length;

     for(int i = 0;i<size12;i++){
          if(i%2==0){
               arr12[i] = arr12[i]+=10;
          }else{
               arr12[i] = arr12[i] * 2;
          }
     }
     for(int m =0 ;m<size12;m++){
          System.out.println(arr12[m]);
     }



 // CHECK WHETHER THE ARRAY IS PALINDROME POR NOT    
     int[]arr13 = {2,6,5,5,6,2};
     int size13=arr13.length,palindrome=0;

     for(int i=0;i<size13;i++){
          if(arr13[i] == arr13[size13 - i - 1]){
               palindrome = 1;
               break;
          }
     }

     if(palindrome==1){
          System.out.println("this array is a palindrome");
     }else{
          System.out.println("this arary is not the palindrome");
     }



 // EXAMPLE OF A 2D ARRAY    
     int [][]arr14 = new int[2][3];
     // int size = arr.length;
      for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
               arr14[i][j] = keep.nextInt();
          }
      }
      for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
               System.out.printf("%d\t",arr14[i][j]);
          }
          System.out.print("\n");
      }



// EXAMPLE OF ARRAYT WITH USING FOR-EACH LOOP      
     int []arr15 = {3,5,7,8,2,0,9};
     int size15 = arr15.length;
     Arrays.sort(arr15);
     for(int i : arr15){
          System.out.println(i);
     }

     

keep.close();
}
     }
