package PreparacionExamen2Ejercicios.ifElse4al9.Ejercicio9.modelo;

public class Empleado4 {
        private double salario;
        private boolean genero;
        private boolean hijos;

        public Empleado4(double salario, boolean genero, boolean hijos) {
            this.salario = salario;
            this.genero = genero;
            this.hijos = hijos;
        }

        public double calcularAumento() {
            double aumento = 0.0;
            if (salario < 15000) {
                aumento = salario * 0.15;
            } else {
                aumento = salario * 0.12;
            }
            if (genero==true) {
                aumento += salario * 0.02;
            }
            aumento += salario * 0.01;
            return aumento;
        }

        public double calcularSalarioTotal() {
            return salario + calcularAumento();
        }

        public String toString() {
            return "Salario: " + salario + "\nGénero: " + genero + "\nHijos: " + hijos;
        }


}
