import javax.swing.JOptionPane;

public class cicloFor {
    public static void main(String[] arqs) {
        float estatura, imc;
        int peso;
        byte resp;
        
        for (resp = 1; resp == 1; ) {
            try {
                peso = Integer.parseInt(JOptionPane.showInputDialog("Captura tu"
                        + " peso (kg):"));
                estatura = Float.parseFloat(JOptionPane.showInputDialog("Captura"
                        + " tu estatura en metros (m):"));

                imc = peso / (estatura * estatura);

                if (imc < 18.49) {
                    JOptionPane.showMessageDialog(null, "Peso Bajo");
                } else if (imc >= 18.50 && imc <= 24.99) {
                    JOptionPane.showMessageDialog(null, "Peso Normal");
                } else if (imc >= 25 && imc <= 29.99) {
                    JOptionPane.showMessageDialog(null, "Sobrepeso");
                } else if (imc >= 30 && imc <= 34.99) {
                    JOptionPane.showMessageDialog(null, "Obesidad leve");
                } else if (imc >= 35 && imc <= 39.99) {
                    JOptionPane.showMessageDialog(null, "Obesidad media");
                } else {
                    JOptionPane.showMessageDialog(null, "Obesidad mórbida");
                }

                resp = Byte.parseByte(JOptionPane.showInputDialog("¿Quieres"
                        + " hacer otro cálculo? Ingresa 1 para sí, 0 para no:"));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa valores"
                        + " numéricos válidos.");
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
    }
}
