public class largestprime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(22));
    }

    public static int getLargestPrime(int number) {
            int i;
            if(number <= 1)
                return  -1;

        for(i =2; i <= number; i++){
            if(number % i ==0){
                number /= i;
                i--;
            }


        }
        return i;

    }


}
