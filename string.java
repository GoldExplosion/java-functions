// find the number of words in a string
static int word(String string)
      {
        int count=0;
  
          char ch[]= new char[string.length()];   
          for(int i=0;i<string.length();i++)
          {
              ch[i]= string.charAt(i);
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                  count++;
          }
          return count;
      }
// replace some words
static String Q1(String b)
{
  String bnew = b.replaceAll("the ", "EHT ");
  String bnew2 = bnew.replaceAll("and ", "DNA ");
  String bnew3 = bnew2.replaceAll("for ", "ROF ");
  return bnew3;
}
// replace the first and last occurence
static StringBuilder Q2(String b)
{
  String bnew = b.replaceFirst("are ", "AREERA ");
  StringBuilder input = new StringBuilder(bnew);
  int index = input.lastIndexOf("of ");
  input.replace(index, 2+index, "123");
  return input;
}
// replace every letter with the adjacent letter in alphabetical order
static String Q4(StringBuilder s){
 int k=1;
 String newS=new String();
         for (int i = 0; i < s.length(); ++i) {
     int val = s.charAt(i);
     if (val>=32 && val<=64){
         newS += (char)(val);
     }
 
     else{
     int dup = k;
     if (val + k > 122) {
         k -= (122 - val);
         k = k % 26;
 
         newS += (char)(96 + k);
     } else {
         newS += (char)(val + k);
     }
 
     k = dup;
     }
 }
 
 return newS;
}
// replace every 10th letter with something
static StringBuffer Q5(StringBuffer sb){
 int i;
 for(i=0;i<sb.length();i++)
         {
             if(i!=0 && i%10==0)
             {
                 sb.replace(i-1,i,"$");
             }
         }
 return sb;
}

