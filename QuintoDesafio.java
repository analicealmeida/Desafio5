/**
 * QuintoDesafio
 */
public class QuintoDesafio {
        
        
        public static boolean result=false;  
    public static void main(String[] args) {  
    //Verificando se a String é um anagrama de um palindromo
    /*O que é um anagrama de um palindromo? Palavra que se pode ler tanto de frente para trás, quanto de trás para frente. */

        String str = "racecar";  

    anagrama(str,"");  
    System.out.println(result);  
    }  

     public static void anagrama(String str,String asf){  
        if(str.length()==0){  
            if(isPalindroma(asf))  
            result=true;  
          return;  
        }  
        //o melhor modo de manipular uma String é pelo seu indice
        for(int i=0;i<str.length();i++){  
            char ch=str.charAt(i);  
            String left=str.substring(0,i);  
            String right=str.substring(i+1);  
            anagrama(left+right,asf+ch);  
        }  
    }  
    public static boolean isPalindroma(String str){  
        int left=0;  
        int right=str.length()-1;  
        while(left<=right){  
            if(str.charAt(left)!=str.charAt(right))  
            return false;  
            left++;  
            right--;  
        }  
        return true;  
    }  
    }
    
