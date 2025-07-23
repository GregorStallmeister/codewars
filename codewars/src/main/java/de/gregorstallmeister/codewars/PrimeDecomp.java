package de.gregorstallmeister.codewars;

public class PrimeDecomp {
    // below top 50
    public static String factors(int n) {
        int rest = n;
        int currPrime = 2;
        StringBuilder resBuilder = new StringBuilder();

        while (rest > 1) {
            int exp = 0;
            while (rest % currPrime == 0) {
                exp++;
                rest /= currPrime;
            }

            if (exp > 0) {
                resBuilder.append("(");
                resBuilder.append(currPrime);
                if (exp > 1) {
                    resBuilder.append("**");
                    resBuilder.append(exp);
                }
                resBuilder.append(")");
            }

            currPrime = getNextPrime(currPrime);
        }

        return resBuilder.toString();
    }

    public static int getNextPrime(int p) {
        int n = p + 1;

        for (int d = 2; d <= Math.sqrt(n); d++) {
            if (n % d == 0) {
                n++;
                break;
            }
        }

        return n;
    }


    //        switch (p) {
//            case 2:
//                return 3;
//            case 3:
//                return 5;
//            case 5:
//                return 7;
//            case 7:
//                return 11;
//            case 11:
//                return 13;
//            case 13:
//                return 17;
//
//            default:
//                return -1;
}

