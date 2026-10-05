public class L02EX04 {
    public static void main(String[] args) {
        
        int T=0, D=0, C=0;
        for(int i =1;i<=1000;i++){
            if(i%2==0){
                D++;
            }
            if(i%3==0){
                T++;
                //System.out.println(T);
            }
            if(i%5==0)
                C++;
        }
        System.out.println("Os multiplos de 2,3 e 5 de 1 a 1000, sao:"+D+","+T+","+C);
    }
}
