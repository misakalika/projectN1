 public class test {

    public static void main (String args[]){
        int h = 1;
        int x = 10;

        int i = h + (int) (Math.random() * x);
        System.out.println("1-ое случайное число: " + i);

        int b = h + (int) (Math.random() * x);
        System.out.println("2-ое случайное число: " + b);

        int c = h + (int) (Math.random() * x);
        System.out.println("3-е случайное число: " + c);
    }
}