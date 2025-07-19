package br.com.bank.utils;

public class processDocument {

    public static boolean isLastDigitEven(String cpf) {

        String numericCpf = cpf.replaceAll("\\D", "");

        char lastChar = numericCpf.charAt(numericCpf.length() - 1);

        int lastDigit = Character.getNumericValue(lastChar);

        return lastDigit % 2 == 0;
    }

}
