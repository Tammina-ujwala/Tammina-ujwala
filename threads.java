import java.lang.*;
import java.util.*;
class thread1 extends Thread
{
public void run()
{
try
{
System.out.println("here i am"+Thread.currentThread().getName());
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class week14
{
public static void main(String args[])
{
Thread t1=new Thread(new thread1());
Thread t2=new Thread(new thread1());
Thread t3=new Thread(new thread1());

t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t3.setPriority(Thread.NORM_PRIORITY);

t1.start();
t2.start();
t3.start();
}
}