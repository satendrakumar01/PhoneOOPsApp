public class Main {
    public static void main(String[] args) {


//        System.out.println("Hello world!");
        Landline l1=new Landline("01206420814");
        Landline l2=new Landline("9650454593");
        l1.callNumber("9650454593");
        l2.recieveCall("9650454593");
        System.out.println(l2.answerCall());

    }
}