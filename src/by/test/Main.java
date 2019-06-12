package by.test;

public class Main {

    public static long findingSumm (long N){
        long summ=0;
        long n=25;
        for(int i = 1; i<=N; i++){
            if (i%3==0) {
                summ+=i;
            } else
            if (i%5==0) {
                summ+=i;
            } else
            if (i%7==0) {
                summ+=i;
            }
        }
        return summ;
    }

//    public static int summ=0;

    public static long findingSummRec (long N){
        long summ;
        if (N==0){return 0;}
        else
            if (N%3==0) {
            summ =findingSummRec(N-1)+ N;
        } else
        if (N%5==0) {
            summ =findingSummRec(N-1)+ N;
        } else
        if (N%7==0) {
            summ =findingSummRec(N-1)+ N;
        } else  return findingSummRec(N-1);
        return summ;
    }

    public static long findingSummNotRec (long N){
        long n1,n2,n3;
        long x1=0,x2=0,x3=0,x4=0;
        n1=((3+(3+3*(N/3-1)))*(N/3))/2;
        n2=((5+(5+5*(N/5-1)))*(N/5))/2;
        n3=((7+(7+7*((N/7)-1)))*(N/7))/2;

        if ((15)<=N){
            x1=((15+(15+15*(N/15-1)))*(N/15))/2;
            x2=((21+(21+21*(N/21-1)))*(N/21))/2;
            x3=((35+(35+35*(N/35-1)))*(N/35))/2;
        }
        if ((105)<=N){
            x4=((105+(105+105*((N/105)-1)))*(N/105))/2;
        }

        return n1+n2+n3-x1-x2-x3+x4;
    }



    public static void main(String[] args) {
        System.out.println(findingSumm(2000000000));
//        System.out.println(findingSummRec(2000000000));
        System.out.println(findingSummNotRec(2000000000));
    }



}
