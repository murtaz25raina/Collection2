import java.util.*;
public class CommonInSets {
public static void main(String[] x)
{
	Scanner scan=new Scanner(System.in);
    Set<Integer> s1 = new HashSet<Integer>();
    Set<Integer> s2 = new HashSet<Integer>();
    int size1,size2;
    size1=scan.nextInt();
    size2=scan.nextInt();
    for(int i=0;i<size1;i++)
    {
    	int num=scan.nextInt();
        s1.add(num);
    }
    for(int i=0;i<size2;i++)
    {
    	int num=scan.nextInt();
        s2.add(num);
    }
    s1.retainAll(s2);
    Iterator <Integer> it=s1.iterator();
    while(it.hasNext())
    	System.out.print(it.next()+" ");
}
}