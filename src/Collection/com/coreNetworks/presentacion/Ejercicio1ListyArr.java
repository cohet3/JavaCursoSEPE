package Collection.com.coreNetworks.presentacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1ListyArr {
    public static void main(String[] args) {
        int[] arrNum = new int[5];
        arrNum[0] = 1;
        arrNum[1] = 3;
        arrNum[2] = 6;
        arrNum[3] = 9;
        arrNum[4] = 12;
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
        List listaNum = new ArrayList();
        listaNum.add(10);
        listaNum.add(20);
        listaNum.add(30);
        listaNum.add(40);
        listaNum.add(50);
        for (int i =0; i<listaNum.size(); i++){
            System.out.println(listaNum.get(i));
        }

    }
}
