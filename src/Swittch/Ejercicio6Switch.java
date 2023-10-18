package Swittch;

import java.util.Scanner;

public class Ejercicio6Switch {
    public static void main(String[] args) {
        //6. pedir un numero 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y sei
        // unidades = num %10;
        //decenas = num / 10;
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        num1 =  scanner.nextInt();
        String uno = "uno", dos = "dos", tres = "tres", cuatro = "cuatro",cinco = "cinco", seis = "seis",siete = "siete", ocho = "ocho",nueve = "nueve";
        String diez = "diez", veinte= "veinte", treinta= "treinta", cuarenta="cuarenta", cincuenta= "cincuenta";
        String sesenta ="sesenta", setenta= "setenta", ochenta= "ochenta", noventa= "noventa";
        String once = "once", doce = "doce", trece = "trece", catorce= "catorce" ,quince = "quince";
        String dieciseis= "dieciseis", diecisiete = "diecisiete", dieciocho ="dieciocho", diecinueve= "dicecinueve";
        String venti ="veinti y ", treintaa= "treinta y ", cuarentaa= "cuarenta y ", cincuentaa= "cincuenta y ", sesentaa="sesenta y ";
        String setentaa ="seteta y ", ochentaa = "ochenta y ", noventaa="noventa y ";

        switch (num1){
            case 1:
                System.out.println(uno);
                break;
            case 2:
                System.out.println(dos);
                break;
            case 3:
                System.out.println(tres);
                break;
            case 4:
                System.out.println(cuatro);
                break;
            case 5:
                System.out.println(cinco);
                break;
            case 6:
                System.out.println(seis);
                break;
            case 7:
                System.out.println(siete);
                break;
            case 8:
                System.out.println(ocho);
                break;
            case 9:
                System.out.println(nueve);
                break;
            case 10:
                System.out.println(diez);
                break;
            case 11:
                System.out.println(once);
                break;
            case 12:
                System.out.println(doce);
                break;
            case 13:
                System.out.println(trece);
                break;
            case 14:
                System.out.println(catorce);
                break;
            case 15:
                System.out.println(quince);
                break;
            case 16:
                System.out.println(dieciseis);
                break;
            case 17:
                System.out.println(diecisiete);
                break;
            case 18:
                System.out.println(dieciocho);
                break;
            case 19:
                System.out.println(diecinueve);
                break;
            case 20:
                System.out.println(veinte);
                break;
            case 21:
                System.out.println(venti + uno);
                break;
            case 22:
                System.out.println(venti + dos);
                break;
            case 23:
                System.out.println(venti + tres);
                break;
            case 24:
                System.out.println(venti + cuatro);
                break;
            case 25:
                System.out.println(venti + cinco);
                break;
            case 26:
                System.out.println(venti + seis);
                break;
            case 27:
                System.out.println(venti + siete);
                break;
            case 28:
                System.out.println(venti + ocho);
                break;
            case 29:
                System.out.println(venti + nueve);
                break;
            case 30:
                System.out.println(treinta);
                break;
            case 31:
                System.out.println(treintaa +uno);
                break;
            case 32:
                System.out.println(treintaa +dos);
                break;
            case 33:
                System.out.println(treintaa +tres);
                break;
            case 34:
                System.out.println(treintaa +cuatro);
                break;
            case 35:
                System.out.println(treintaa +cinco);
                break;
            case 36:
                System.out.println(treintaa +seis);
                break;
            case 37:
                System.out.println(treintaa +siete);
                break;
            case 38:
                System.out.println(treintaa +ocho);
                break;
            case 39:
                System.out.println(treintaa +nueve);
                break;
            case 40:
                System.out.println(cuarenta);
                break;
            case 41:
                System.out.println(cuarentaa +uno);
                break;
            case 42:
                System.out.println(cuarentaa+dos);
                break;
            case 43:
                System.out.println(cuarentaa+tres);
                break;
            case 44:
                System.out.println(cuarentaa+cuatro);
                break;
            case 45:
                System.out.println(cuarentaa+cinco);
                break;
            case 46:
                System.out.println(cuarentaa+seis);
                break;
            case 47:
                System.out.println(cuarentaa+siete);
                break;
            case 48:
                System.out.println(cuarentaa+ocho);
                break;
            case 49:
                System.out.println(cuarentaa +nueve);
                break;
            case 50:
                System.out.println(cincuenta);
                break;
            case 51:
                System.out.println(cincuentaa + uno);
                break;
            case 52:
                System.out.println(cincuentaa+dos);
                break;
            case 53:
                System.out.println(cincuentaa+tres);
                break;
            case 54:
                System.out.println(cincuentaa+cuatro);
                break;
                case 55:
                System.out.println(cincuentaa+cinco);
                break;
            case 56:
                System.out.println(cincuentaa+seis);
                break;
            case 57:
                System.out.println(cincuentaa +siete);
                break;
            case 58:
                System.out.println(cincuentaa + ocho);
                break;
            case 59:
                System.out.println(cincuentaa+nueve);
                break;
            case 60:
                System.out.println(sesenta);
                break;
            case 61:
                System.out.println(sesentaa+uno);
                break;
            case 62:
                System.out.println(sesentaa+dos);
                break;
            case 63:
                System.out.println(sesentaa+tres);
                break;
            case 64:
                System.out.println(sesentaa+cuatro);
                break;
            case 65:
                System.out.println(sesentaa+cinco);
                break;
            case 66:
                System.out.println(sesentaa+seis);
                break;
            case 67:
                System.out.println(sesentaa+siete);
                break;
            case 68:
                System.out.println(sesentaa+ocho);
                break;
            case 69:
                System.out.println(sesentaa+nueve);
                break;
            case 70:
                System.out.println(setenta);
                break;
            case 71:
                System.out.println(setentaa+uno);
                break;
            case 72:
                System.out.println(setentaa+dos);
                break;
            case 73:
                System.out.println(setentaa+tres);
                break;
            case 74:
                System.out.println(setentaa+cuatro);
                break;
            case 75:
                System.out.println(setentaa+cinco);
                break;
            case 76:
                System.out.println(setentaa+seis);
                break;
            case 77:
                System.out.println(setentaa+siete);
                break;
            case 78:
                System.out.println(setentaa+ocho);
                break;
            case 79:
                System.out.println(setentaa+nueve);
                break;
            case 80:
                System.out.println(ochenta);
                break;
            case 81:
                System.out.println(ochentaa+uno);
                break;
            case 82:
                System.out.println(ochentaa+dos);
                break;
            case 83:
                System.out.println(ochentaa+tres);
                break;
            case 84:
                System.out.println(ochentaa+cuatro);
                break;
            case 85:
                System.out.println(ochentaa+cinco);
                break;
            case 86:
                System.out.println(ochentaa+seis);
                break;
            case 87:
                System.out.println(ochentaa+siete);
                break;
            case 88:
                System.out.println(ochentaa+ocho);
                break;
            case 89:
                System.out.println(ochentaa+nueve);
                break;
            case 90:
                System.out.println(noventa);
                break;
            case 91:
                System.out.println(noventaa+uno);
                break;
            case 92:
                System.out.println(noventaa+dos);
                break;
            case 93:
                System.out.println(noventaa+tres);
                break;
            case 94:
                System.out.println(noventaa+cuatro);
                break;
            case 95:
                System.out.println(noventaa+cinco);
                break;
            case 96:
                System.out.println(noventaa+seis);
                break;
            case 97:
                System.out.println(noventaa+siete);
                break;
            case 98:
                System.out.println(noventaa+ocho);
                break;
            case 99:
                System.out.println(noventaa+nueve);
                break;
            default:
                System.out.println("El número tiene que estar en el rango 1 al 99");


        }
    }
}
