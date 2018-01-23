package java8.lang;


public class CountNoEncodingOfDigitString
{
  int countEncoding(String s)
  {
    int len = s.length();
    int count = 0;
    if ((len == 1) || (len == 0)) {
      return 1;
    }
    if (s.charAt(len - 1) > '0') {
      count = countEncoding(s.substring(0, len - 1));
    }
    if ((s.charAt(len - 2) < '2') || (
      (s.charAt(len - 2) == '2') && (s.charAt(len - 1) < '7'))) {
      count += countEncoding(s.substring(0, len - 2));
    }
    return count;
  }
  
  int dynamicCountEncoding(String s)
  {
    int len = s.length();
    int[] t = new int[len +1];
    t[0] = 1;
    t[1] = 1;
    for (int i = 2; i <= len; i++)
    {
      if (s.charAt(i - 1) > '0') {
        t[i] = t[(i - 1)];
      }
      if ((s.charAt(i - 2) < '2') || ((s.charAt(i - 2) == '2') && (s.charAt(i - 1) < '7'))) {
        t[i] += t[(i - 2)];
      }
    }
   // for(int i : t)
    //	System.out.print(i+" ");
    	
    return t[len];
  }
  
  public static void main(String[] args)
  {
    CountNoEncodingOfDigitString obj = new CountNoEncodingOfDigitString();
    System.out.println(obj.countEncoding("314"));
    System.out.println(obj.dynamicCountEncoding("314"));
  }
}
