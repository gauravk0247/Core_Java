// 08/09/23
// Q1. Write a program to calculate the factorial of the number.
class Assignment2{
	public static void main(String[] args){
		int num=5;
        int fact=1;
        for(int i=1;i<=num;i++)
       {
           fact=fact*i;
       }
        System.out.println("Factorial of the number: "+fact); 		
	}
}


// Q.2 Write a program to print the fibonacci series.
class  Assignment3{
	public static void main(String[] args){
        int t1 = 0, t2 = 1, n=5;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
}

// Q.3 Write a java program to find check palindrome of number.
class Assignment4{
	public static void main(String[] args){
		int num=45;
       int r,sum=0;
       int temp=num;    
       while(num>0)
       {    
       r=num%10;    
       sum=(sum*10)+r;    
       num=num/10;    
       }    
        if(temp==sum)    
        System.out.println("The entered number "+temp+" is a palindrome number ");    
        else    
        System.out.println("The entered number "+temp+" is not a palindrome");    
  }  
}

// Q.4 Write a java program to check if any year given is leap year or not.
class Assignment5{
	public static void main(String[] args){
		int year=2021;
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			System.out.println(year + " is a leap year.");
		}
		else {
		  System.out.println(year + " is not a leap year.");
			}
		}
}