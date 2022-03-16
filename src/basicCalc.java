import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;
public class basicCalc {
    public static void main(String[] args) throws IOException {
        float firstNumberFikireyesus, secondnumberfikireyesus, sum, substraction, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program calculates su, difference, product and qoutient for two numbers");
        System.out.println("Please enter the first number (then press enter):");
        firstNumberFikireyesus=Float.parseFloat(br.readLine());
        System.out.println("Please enter the second number (and press enter):");
        secondnumberfikireyesus=Float.parseFloat(br.readLine());
        sum=firstNumberFikireyesus+secondnumberfikireyesus;
        substraction=firstNumberFikireyesus-secondnumberfikireyesus;
        product=firstNumberFikireyesus*secondnumberfikireyesus;
        quotient=firstNumberFikireyesus/secondnumberfikireyesus;
        System.out.printf("you entered two numbers, the first one is :"+"%2.2f",firstNumberFikireyesus);
        System.out.printf("and the second is:"+"%2.2f",secondnumberfikireyesus);
        System.out.println();
        System.out.printf("sum = "+"%2.2f, \n",+sum);
        System.out.printf("difference = "+"%2.2f, \n",+substraction);
        System.out.printf("product = "+"%2.2f, \n",+product);
        System.out.printf("qoutient = "+"%2.2f, \n",+quotient);
    }
}
