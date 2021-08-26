import java.util.*;
public class Zodiac {
    static String zodaicSign(int day, int month){
        String astro_sign=""; 
        String w = "Astrological sign for ";
        if(day <= 31 && month <= 12){
            if (month == 12){ 
                
                if (day < 22) 
                    astro_sign = w + day + "-" + month + " is Sagittarius"; 
                else
                    astro_sign = w + day + "-" + month + " is Capricorn"; 
            } 
                
            else if (month == 1){ 
                if (day < 20) 
                    astro_sign = w + day + "-" + month + " is Capricorn"; 
                else
                    astro_sign = w + day + "-" + month + " is Aquarius"; 
            } 
                
            else if (month == 2){ 
                if (day < 19) 
                    astro_sign = w + day + "-" + month + " is Aquarius"; 
                else
                    astro_sign = w + day + "-" + month + " is Pisces"; 
            } 
                
            else if(month == 3){ 
                if (day < 21)  
                    astro_sign = w + day + "-" + month + " is Pisces"; 
                else
                    astro_sign = w + day + "-" + month + " is Aries"; 
            } 
            else if (month == 4){ 
                if (day < 20) 
                    astro_sign = w + day + "-" + month + " is Aries"; 
                else
                    astro_sign = w + day + "-" + month + " is Taurus"; 
            } 
                
            else if (month == 5){ 
                if (day < 21) 
                    astro_sign = w + day + "-" + month + " is Taurus"; 
                else
                    astro_sign = w + day + "-" + month + " is Gemini"; 
            } 
                
            else if( month == 6){ 
                if (day < 21) 
                    astro_sign = w + day + "-" + month + " is Gemini"; 
                else
                    astro_sign = w + day + "-" + month + " is Cancer"; 
            } 
                
            else if (month == 7){ 
                if (day < 23) 
                    astro_sign = w + day + "-" + month + " is Cancer"; 
                else
                    astro_sign = w + day + "-" + month + " is Leo"; 
            } 
                
            else if( month == 8){ 
                if (day < 23)  
                    astro_sign = w + day + "-" + month + " is Leo"; 
                else
                    astro_sign = w + day + "-" + month + " is Virgo"; 
            } 
                
            else if (month == 9){ 
                if (day < 23) 
                    astro_sign = w + day + "-" + month + " is Virgo"; 
                else
                    astro_sign = w + day + "-" + month + " is Libra"; 
            } 
                
            else if (month == 10){ 
                if (day < 23) 
                    astro_sign = w + day + "-" + month + " is Libra"; 
                else
                    astro_sign = w + day + "-" + month + " is Scorpio"; 
            } 
                
            else if (month == 11){ 
                if (day < 22) 
                    astro_sign = w + day + "-" + month + " is Scorpio"; 
                else
                    astro_sign = w + day + "-" + month + " is Sagittarius"; 
            }
        }
        else{
            astro_sign = "Invalid Date/Month";
        }
        return astro_sign;      
        //System.out.println(astro_sign); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String s[] = w.split(" ");
        int date = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        String output = zodaicSign(date, month);
        System.out.println(output);
    }
}
