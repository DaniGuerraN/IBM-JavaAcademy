package class_24_03_22.ChallengeInClass_1;


public class Calculator {

        public static type1 add = ((v1, v2) -> v1 + v2);
        public static type1 sub = (v1,v2) -> v1 - v2;
        public static type2 isOdd = (v1) -> v1 % 2 == 0;
        public static type2 isPrime = (v1) -> {
            boolean flag = true;
            for(int i=1; i<v1;i++){
                if (v1 % i == 0 && i != 1) {
                    flag = false;
                    break;
                }
            }
            return flag;
        };
        public static type3 factorial = (v1) -> {
            int sum = v1 * (v1 -1) ;
            v1 = v1- 2;
            while (v1 != 0){
                sum = sum * v1;
                v1--;
            }
            return sum;
        };


    public int operation(type1 lf,int v1,int v2){
        return lf.operation(v1,v2);
    }
    public boolean operation(type2 lf,int v1){
        return lf.operation(v1);
    }
    public int operation(type3 lf,int v1){
        return lf.operation(v1);
    }

}


@FunctionalInterface
interface type1{
    int operation(int v1,int v2);
}
@FunctionalInterface
interface type2{
    boolean operation(int v1);
}
@FunctionalInterface
interface type3{
    int operation(int v1);
}