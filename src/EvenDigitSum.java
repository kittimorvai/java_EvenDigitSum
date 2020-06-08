public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));

    }

    public static boolean isEvenNumber(int num) {
        if ((num > 0) && (num % 2 == 0)) {
            return true;
        }
        return false;
    }

    public static int getEvenDigitSum (int number){

        int sum = 0;
        int newNumber = number;
        int numberToInvestigate;


        if(number < 0){
            return -1;
        }

        while (newNumber > 0){
            numberToInvestigate = newNumber % 10;
            newNumber  = newNumber / 10;

            if(isEvenNumber(numberToInvestigate)){
                sum += numberToInvestigate;
            }
        }
        return sum;
    }
}
