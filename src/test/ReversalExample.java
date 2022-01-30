package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse String
        //reversal of Array
        //reversal of number
        
        
        String str1 = "Clean India Green India";
        String revStr1 = "";
        
        
        for(int index=str1.length()-1;index>=0;index--) {
            
            revStr1 = revStr1 + str1.charAt(index);
        }
        
        System.out.println("Reversed String " + revStr1);
        
// Number of Vowels
        
int result = 0;
        
        for(int index=0;index<str1.length();index++) {
            
            if(str1.charAt(index) == 'a' || str1.charAt(index) == 'e' || str1.charAt(index) == 'i' || str1.charAt(index) == 'o'  || str1.charAt(index) == 'u'  ) {
                result ++;
            }
        }

             System.out.println("Number of Vowels = " + result);
             
         //int[] array2 = {'a', 'e', 'i', 'o', 'u'};
         //int result2 = 0;
         //for(int rest=0;rest<str1.length();rest++) {
        	 //if(str1.charAt(rest) == array2[];
              
//Reversal of array
        
        int[] array1 = {20,30,40,50,60};
        
        for(int index1=array1.length-1;index1>=0;index1--) {
            
            System.out.println(array1[index1]);
        }
        
//Reversal of number 
        
        int num5 = 452356;  // result should be like 653254;
        int rev = 0;
        
        while(num5>0) {
        	
        	int remainder = num5%10;
        	rev = rev*10 + remainder;
        	num5 = num5/10;
        	
        }
        
        System.out.println("The reversed value is " + rev);
        }

	}

