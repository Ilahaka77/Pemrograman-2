public class DemoIncrementDecrement{
    public static void main(String[] args){
        int x=1, y=1, z=1;

        //Nilai Awal
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
        System.out.println("Nilai z : " + z);

        //increment
        x++; y++;
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y++);
        System.out.println("Nilai z : " + ++z);

        System.out.println("Nilai y : " + y);

        //Decrement
        x--; y--;
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y--);
        System.out.println("Nilai z : " + --z);

        System.out.println("Nilai y : " + y);

        int a=5, b = 7, c = 5;
        a++; a++; --a; ++b;
        System.out.println(a + --b - c--);
    }
}