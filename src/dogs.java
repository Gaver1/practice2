public class dogs {
    public static void main(String[] args)
    {
        Dog d1 = new Dog ("Rex",5);
        Dog d2 = new Dog ("Backy",2);
        Dog d3 = new Dog ("Clifford",8);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}