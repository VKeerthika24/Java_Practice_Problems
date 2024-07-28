public class Compare_Objects {
    public static void main(String[] args) {
        Double a=new Double(2356.73648);
        Long b=new Long(7386);
        Long c=new Long(874);
        System.out.println(a.equals(b));
        System.out.println(a.equals(a));
        System.out.println(b.equals(c));
    }
}
