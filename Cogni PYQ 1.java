class Solution{
public static String stringQues(String S){
      StringBuilder str = new StringBuilder();
      int ch = S.charAt(0) - 'a' + 1;
      if(ch == 1 || ch == 4 || ch == 9 || ch == 16 || ch == 25){
         if((S.charAt(1) - 'a' +1) == Math.sqrt(ch)){
               str.append(S.charAt(0));
         }else{
            str.append((char)(Math.sqrt(ch) + 'a' -1));
         }
      }else{
         str.append(S.charAt(0));
      }

      for(int i=1; i<S.length()-1; i++){
         ch = S.charAt(i) - 'a' +1;
         if(ch != 1 && ch != 4 && ch != 9 && ch != 16 && ch != 25){
           str.append(S.charAt(i));
         }else{
            int chm1 = S.charAt(i-1) - 'a' +1;
            int chp1 = S.charAt(i+1) - 'a' +1;
            if((chm1 == Math.sqrt(ch)) 
            || (chp1 == Math.sqrt(ch))){
               str.append(S.charAt(i));
            }else{
               char c = (char)(Math.sqrt(ch) + 'a' -1) ;
               str.append(c);
            }
         }
      }

      ch = S.charAt(S.length() - 1) - 'a' +1;
      if(ch == 1 || ch == 4 || ch == 9 || ch == 16 || ch == 25){
         if((S.charAt(S.length()-2) - 'a' +1) == Math.sqrt(ch)){
               str.append(S.charAt(S.length()-1));
         }else{
            str.append((char)(Math.sqrt(ch) + 'a' -1));
         }
      }else{
         str.append(S.charAt((S.length()-1)-'a'));
      }

      return str.toString();
   }
}



// ## Question : 

