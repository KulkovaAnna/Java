package ru.kulkova.lab.task2;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        StrMod t = new StrMod(str);
        System.out.println(t);
    }

}

class StrMod{
    private String str;
    public StrMod(String str){
        this.str = str;
    }
    public int []strToWords(){
        String []M = str.split(" ");
        int N[]= new int[M.length];
        for(int i = 0; i<M.length;i++)
            for(int j = i; j<M.length;j++)
                if (M[i].equals(M[j])) N[i]++;
        return N;
    }
    public String toString(){
        String ret = "Вы ввели строку: "+str+".\nВ этой строке следующие слова: \n";
        String []M = str.split(" ");
        int []N = strToWords();
        boolean fl = false;
        ret = ret+M[0]+" - "+N[0] + "шт.\n";
        int cnt = 1;
        for(int i = 1; i<M.length; i++) {
            fl = false;
            for (int j = 0; j < i; j++)
                if (M[i].equals(M[j])) fl = true;
            if (fl == false)
                ret = ret + M[i] + " - " + N[i] + "шт.\n";
            cnt++;
        }
        ret = ret+"Всего слов: "+cnt+".\n";
        return (ret);
    }
}
//I love you and you love me
//Однажды в студёную зимнюю пору я из лесу вышел : был стльный мороз
//Во имя отца , и сына , и святого духа , Аминь
//На дворе трава , на траве дрова . Не руби дрова на траве двора .
//нет , нет и ещё раз : нет !