package kenylopezmorales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioConSuerte {
    private JTextField numero1TextField;
    private JTextField numero2TextField;
    private JTextField numero3TextField;
    private JButton calcularButton;
    private JTextField resultadoTextField;

    public EjercicioConSuerte() {
        
        JFrame frame = new JFrame("Ejercicio con Suerte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        JLabel numero1Label = new JLabel("Número 1:");
        numero1Label.setBounds(10, 20, 80, 25);
        panel.add(numero1Label);

        numero1TextField = new JTextField(10);
        numero1TextField.setBounds(100, 20, 165, 25);
        panel.add(numero1TextField);

        JLabel numero2Label = new JLabel("Número 2:");
        numero2Label.setBounds(10, 50, 80, 25);
        panel.add(numero2Label);

        numero2TextField = new JTextField(10);
        numero2TextField.setBounds(100, 50, 165, 25);
        panel.add(numero2TextField);

        JLabel numero3Label = new JLabel("Número 3:");
        numero3Label.setBounds(10, 80, 80, 25);
        panel.add(numero3Label);

        numero3TextField = new JTextField(10);
        numero3TextField.setBounds(100, 80, 165, 25);
        panel.add(numero3TextField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(100, 110, 80, 25);
        panel.add(calcularButton);

        JLabel resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(10, 140, 80, 25);
        panel.add(resultadoLabel);

        resultadoTextField = new JTextField(10);
        resultadoTextField.setBounds(100, 140, 165, 25);
        resultadoTextField.setEditable(false);
        panel.add(resultadoTextField);

        calcularButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
              
                int numero1 = Integer.parseInt(numero1TextField.getText());
                int numero2 = Integer.parseInt(numero2TextField.getText());
                int numero3 = Integer.parseInt(numero3TextField.getText());

                
                int resultado = calcularSuma(numero1, numero2, numero3);
                resultadoTextField.setText(String.valueOf(resultado));
            }
        });

        frame.setVisible(true);
    }

    private int calcularSuma(int numero1, int numero2, int numero3) {
        int suma = numero1 + numero2 + numero3;
        if (suma > 0 && suma < 35) {
            return suma;
        } else {
            return 20;
        }
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            EjercicioConSuerte ejercicio = new EjercicioConSuerte();
        });
    }
}
