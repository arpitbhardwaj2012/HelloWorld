import java.util.*;

class fraction
{
int numerator;
int denominator;
fraction(int numerator,int den)
{
this.numerator=numerator;
this.denominator=den;
System.out.println(this.numerator+" "+this.denominator);
simplify();
}
public void add(fraction f)
{
this.numerator=this.numerator*f.denominator+this.denominator*f.numerator;
this.denominator=f.denominator*this.denominator;
simplify();
}

private void simplify()
{
int gcd=1;
int n=numerator;
int d=denominator;
if(d>n)
{
int temp=n;
n=d;
d=temp;
}
while(n%d!=0)
{
System.out.println(n+" "+d);
int tempp=n%d;
n=d;
d=tempp;
}
gcd=d;
if(gcd!=1&&gcd!=0)
{
this.numerator=numerator/gcd;
this.denominator=denominator/gcd;

}
}
public void print()
{
System.out.println(numerator+"\\ "+denominator);
}
public static void main(String args[])
{
fraction f1=new fraction(30,6);
fraction f2=new fraction(3,4);
f1.print();
f2.print();
f2.add(f1);
f2.print();
}
}


var str="Arpit"
console.log(typeof str);