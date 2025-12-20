class Operator {
    public static void main(String args[])
    {
		//check if char value is digit or not
        char x = '6';
        char z = 'a';
        boolean y = x<57 && x>48;
        boolean q = z<57 && z>48;
        System.out.println(y);
        System.out.println(q);
		
		//find largest value
		int a = 1;
		int b = 3;
		int c = 2;
		
		int ans = (a>=b) ? ((a>=c) ? a : c) : ((b>=c) ? b : c);
		int out = (a>=b && a>=c) ? a : ((b>=c) ? b : c);
		System.out.println(ans);
		System.out.println(out);
		
		//check if capital letter
		char d = 'D';
		String e = (d<91 && d>64 ? "Yes" : "No");
		System.out.println(e);
		
		String f = (z<91 && z>64 ? "Yes" : "No");
		System.out.println(f);
		
		
    }
}
