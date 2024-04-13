public class App {
    public static void main(String[] args) throws Exception {
        int num = 2;
        System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);

        System.out.println("  A)--------------");

        num = 2;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(num--);
        System.out.println(num);

        System.out.println("  B)---------------   ");

        num = 2;
        System.out.println(num);
        System.out.println(++num);
        System.out.println(--num);
        System.out.println(num);
    }
}
