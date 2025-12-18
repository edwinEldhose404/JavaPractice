class Variable 
{
    public static void main(String args[]) {

        //Primitive Data Types
        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = 0;
        float e = -2147483648;
        double f = -30;
        char g = 23;
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //Variables
        int x = 30;
        int y = 50;
        int q = 60;

        //With a third variable
        int z = x;
        x = y;
        y = z;

        System.out.println(x + " " + y);

        //Without a third variable

        // x,y = y,x

        //Finding average and sum of x,y,z
        int avg = (x+y+q)/3;
        int sum = x+y+q;

        System.out.println(avg + " " + sum);

        //Celsius to Farenheit
        int farenheit = (x*9/5)+32;

        System.out.println(farenheit);

        //Odd or Even
        if(x%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}
