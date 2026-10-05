public class L02EX01 {
    public static void main(String[] args) {
        int a=233, b = 456;

        while(a<b){
            System.out.println(a+=3);
            if(a>300 && a<400){
                System.out.println(a+=5);
            }
        }
    }
}
