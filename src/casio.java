public class casio {
    public void add(int i,int j) {

        System.out.println(i+j);
    }
    public void add(int i,int j,int k,int y,int t) {

        System.out.println(i+j+k+y+t);
    }
    public void add(int i,int j,int y) {

        System.out.println(i+j+y);
    }
    public void add(int i,int j,int y, int t) {

        System.out.println(i+j+y+t);
    }
    public void add(double i,double j) {

        System.out.println(i+j);
    }
    public void add(char i,char j) {

        System.out.println(i+"  "+"  "+j);
    }
}
class methodoverloadingdemo{
    public static void main(String args[]){
        casio obj=new casio();
        obj.add(4,2);
        obj.add(5,6,7,8,9);
        obj.add(6,7,8);
        obj.add(7,9,10,22);
        obj.add(7.5,8.3);
        obj.add('A','B');
    }
        }
