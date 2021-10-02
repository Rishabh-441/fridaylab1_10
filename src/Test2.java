import java.util.Scanner;

abstract class Xyz{
    abstract public void password(String k);
        }

class Door{
    public static void iscorrect(String key){
//        create local inner class
        class Abc extends Xyz{

            @Override
            public void password(String k) {
                if (key.equals(k)){
                    System.out.println("correct");
                }
                else System.out.println("incorrect");
            }
        }
        Abc obj = new Abc();
        System.out.println("enter the passowrd:");
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        obj.password(k);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Door.iscorrect("hello");
    }
}
