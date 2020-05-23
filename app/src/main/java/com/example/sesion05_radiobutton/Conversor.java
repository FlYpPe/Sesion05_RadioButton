package com.example.sesion05_radiobutton;

public class Conversor {
    public int convertirDecimal(int num){return Integer.parseInt(String.valueOf(num));
    }
    public String convertirBinario(int num){
        return Integer.toBinaryString(num);
    }
    public String convertirOctal(int num){
        return Integer.toOctalString(num);
    }
    public String convertirHexadecimal(int num){
        return Integer.toHexString(num);
    }

}
