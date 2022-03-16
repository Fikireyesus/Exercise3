import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BMIcalculator {
    public static void main(String[]args) throws IOException{
        float fikireyesusHeight,fikireyesusWeight,fikireysusBodyMassIndex;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("this program will calculate the Body mass index");
        System.out.println("Please enter your height in cm (then press enter)");
        fikireyesusHeight=Float.parseFloat(br.readLine())/100;
        System.out.println("Please enter your weight in kg (then press enter)");
        fikireyesusWeight=Float.parseFloat(br.readLine());
        fikireysusBodyMassIndex=(float)(fikireyesusWeight/(Math.pow(fikireyesusHeight,2)));
        System.out.printf("Dear your BMI is:"+"%2.2f,\n",fikireysusBodyMassIndex);
        if(fikireysusBodyMassIndex<16){
            System.out.println("you are starving");
        }else if(fikireysusBodyMassIndex>=16&&fikireysusBodyMassIndex<16.99){
            System.out.println("you are emaciated)");
        }else if(fikireysusBodyMassIndex>=17&&fikireysusBodyMassIndex<18.49){
            System.out.println("You are underweight)");
        }else if(fikireysusBodyMassIndex>=18.50&&fikireysusBodyMassIndex<22.99){
            System.out.println("You are in the low range of the norm");
        }else if(fikireysusBodyMassIndex>=23&& fikireysusBodyMassIndex<24.99){
            System.out.println("You are in the high range of the norm");
        }else if (fikireysusBodyMassIndex>=25&&fikireysusBodyMassIndex<27.49){
            System.out.println("You are overweight(pre-obese)");
        }else if (fikireysusBodyMassIndex>=27.50&& fikireysusBodyMassIndex<29.99){
            System.out.println("You are overweight)");
        }else if(fikireysusBodyMassIndex>=30&&fikireysusBodyMassIndex<34.99){
            System.out.println("You have 1st degree obesity");
        }else if (fikireysusBodyMassIndex>=35&&fikireysusBodyMassIndex<39.99){
            System.out.println("You have 2nd degree obesity");
        }else if(fikireysusBodyMassIndex>40){
            System.out.println("You 3rd degree obesity");

        }
    }
}
