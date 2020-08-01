// input sqaure matrix of dim mxm
public static double[][] Input_SquareMatrix(int m){
Scanner in = new Scanner(System.in);
double A[][] = new double[m][m];
for(int i=0;i<m;i++)
{
  for(int j=0;j<m;j++)
  {
    A[i][j]=in.nextDouble();
  }
}
return A;
}
// find if a sq.matrix is diagonal 
public static boolean isDiagonal(double A[][], int m){
for(int i=0;i<m;i++)
   {
     for(int j=0;j<m;j++)
     {
       if(i!=j)
       {
         if(A[i][j]!=0)
           return false;
       }
     }
   }
return true;
}
// adding 2 matrix
public static double[][] Add2Matrix(double B[][], double C[][], int m){
double D[][] = new double[m][m];
for(int i=0;i<m;i++)
     {
       for(int j=0;j<m;j++)
       {
         D[i][j]=B[i][j]+C[i][j];
        
       }
     }
return D;
}
// printing the matrix 
public static void PrintMatrix(double D[][], int m){
for(int i=0;i<m;i++)
   {
     for(int j=0;j<m;j++)
     {
       System.out.print(D[i][j]);
       System.out.print("        ");
     }
     System.out.print("\n");
   }
}
// checks if a sq. matrix is an idenitity matrix
public static boolean isIdentity(double A[][], int m)
{
int j=0;
for(int i=0; i<m; i++)
{
  if(A[i][j]!=1) return false;
  j++;
}
return true;
}
// transpose of sq. matrix
public static double[][] Transpose(double C[][], int m)
{
double[][] E = new double[m][m];
for(int i=0;i<m;i++)
    {
      for(int j=0;j<m;j++)
      {
        E[j][i]=C[i][j];
      }
    }
return E;
}

