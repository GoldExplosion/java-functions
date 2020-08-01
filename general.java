// to print a priramid of 8's
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number(enter 4 for the assignment result)");
     int limit = in.nextInt();
     int limit2 = limit*2;
     int i=0,j;
 
     for(i=1;i<limit2;i++) {
         if(i<=limit) {
             for(j=0;j<i;j++)
             System.out.print("8 ");
         }
         else {
             for(j=0;j<limit2-i;j++)
             System.out.print("8 ");
         }
         System.out.println("");
       }
   }
// find the index
public static int findIndex(int arr[], int t)
   {
       if (arr == null) {
           return -1;
       }
       int len = arr.length;
       int i = 0;
       while (i < len) {
           if (arr[i] == t) {
               return i;
           }
           else {
               i = i + 1;
           }
       }
       return -1;
   }
// check if a element is present in an array
public static boolean Present(int arr[], int t)
   {
       if (arr == null) {
           return false;
       }
       int len = arr.length;
       int i = 0;
       while (i < len) {
           if (arr[i] == t) {
               return true;
           }
           else {
               i = i + 1;
           }
       }
       return false;
   }


