import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CajeroAutomatico extends JFrame implements ActionListener {
    private JTextField montoField;
    private JTextArea displayArea;
    private JButton retiroButton, consultaButton, depositoButton, transferenciaButton, pagoButton, cambioPinButton, extractoButton;

    public CajeroAutomatico() {
        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        montoField = new JTextField(10);
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);

        retiroButton = new JButton("Retiro de Efectivo");
        consultaButton = new JButton("Consulta de Saldo");
        depositoButton = new JButton("Depósito");
        transferenciaButton = new JButton("Transferencia");
        pagoButton = new JButton("Pago de Servicios");
        cambioPinButton = new JButton("Cambio de PIN");
        extractoButton = new JButton("Impresión de Extractos");

        retiroButton.addActionListener(this);
        consultaButton.addActionListener(this);
        depositoButton.addActionListener(this);
        transferenciaButton.addActionListener(this);
        pagoButton.addActionListener(this);
        cambioPinButton.addActionListener(this);
        extractoButton.addActionListener(this);

        add(new JLabel("Monto:"));
        add(montoField);
        add(retiroButton);
        add(consultaButton);
        add(depositoButton);
        add(transferenciaButton);
        add(pagoButton);
        add(cambioPinButton);
        add(extractoButton);
        add(new JScrollPane(displayArea));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        String monto = montoField.getText();
        displayArea.append("Operación: " + action + "\n");
        if (!monto.isEmpty()) {
            displayArea.append("Monto: " + monto + "\n");
        }
        displayArea.append("Operación completada.\n\n");
    }

    public static void main(String[] args) {
        new CajeroAutomatico();
    }
}
