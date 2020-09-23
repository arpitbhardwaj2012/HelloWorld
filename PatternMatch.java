import java.util.*;
import java.lang.*;

class PatternMatch
{
public static void main(String args[])
{
int x=703;
int i=0;
Map<Integer,Character> map=new HashMap<Integer,Character>();
map.put(0,'Z');
for(i=1;i<=25;i++)
{
map.put(i,(char)('A'+i-1));
}
while(x!=0)
{
int num=x%26;
System.out.print(map.get(num));
if(num==0)
{
x=x-26;
}
x=x/26;

} 
}
}




