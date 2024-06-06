package Ejercicio_01_sign;


public class Ejercicio_01_sign {

    public boolean SignValidator(String codigo) {
        for (char c : codigo.toCharArray()) {
            if (!isValidCharacter(c)) {
                System.out.println("CodigoNo valido");
                return false;
            }
        }
        int size = codigo.length();
        do {
            for (int i = 0; i < codigo.length()-1; i++) {
                if((
                    codigo.charAt(i)=='{')&&codigo.charAt(i+1)=='}'||
                    (codigo.charAt(i)=='[')&&codigo.charAt(i+1)==']'||
                    (codigo.charAt(i)=='(')&&codigo.charAt(i+1)==')'){
                    codigo=codigo.substring(0, i)+codigo.substring(i+2, codigo.length());
                }
            } 
            size--;

        } while (size>0);


        return codigo.equalsIgnoreCase("")?true:false;
    }
    
    private boolean isValidCharacter(char c) {
        return c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')';
    }
}
