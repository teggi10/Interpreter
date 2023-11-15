package interpreter;

import java.util.Map;


class EgipcianExpression implements Expression {
   
    private final String[] egipcios = {"Heh","Renacuajo","Dedo","Flor de loto","Cuerda enrollada","Grillete","Trazo"};
    
    public EgipcianExpression(Integer context) {
  
    }

    @Override
    public String interpreter(int context) {
        int [] array = numberArrayConvert(context);
        String texto = "";
        for (int i = 0; i < array.length; i++) {
            texto = texto + multiplicarTexto(egipcios[i],array[i]);
        }
        return texto;
    }


    private String multiplicarTexto(String texto, int x) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < x; i++) {
            resultado.append(texto + " ");
        }
        System.out.println(resultado.toString());
        return resultado.toString();
    }

    private int[] numberArrayConvert(int context){
        Integer contextLength = Integer.toString(context).length();
        int[] numeros = new int[contextLength];
   
        for (int i = 0; i < contextLength; i++) {
            numeros[i] = Character.getNumericValue((Integer.toString(context)).charAt(i));
        }
        for (int digito : numeros) {
            System.out.print(digito + " ");
        }
        System.out.println(numeros);
        return numeros;
    }
  /*   public int interpret(Map<String, Integer> context) {
        return left.interpret(context) * right.interpret(context);
    } */
}
