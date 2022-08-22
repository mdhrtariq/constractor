public class constructordemo
{
 int num1;
 int num2;
 String operation;
    public constructordemo()
    {
        num1=0;
        num2=0;
        operation="nothing";
    }
    public constructordemo(int i)
    {
        num1=i;
        num2=0;
        operation="nothing";
    }
    public constructordemo(int i,int j)
    {
        num1=i;
        num2=j;
        operation="nothing";
    }
    public constructordemo(int i,int j, String op)
    {
        num1=i;
        num2=j;
        operation=op;
    }
}
class constructoroverloading{
    public static void main(String args[]){
        constructordemo obj = new constructordemo(4,6,"sum");
        obj.num1=4;
        obj.num2=7;
        obj.operation="sum";
        System.out.println(obj.num1 +"  "+"  "+ obj.num2 +"  "+"  "+ obj.operation);
    }
}