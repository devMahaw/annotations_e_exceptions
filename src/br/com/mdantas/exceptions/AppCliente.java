package br.com.mdantas.exceptions;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author marcelo.dantas
 */
public class AppCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente", "", JOptionPane.INFORMATION_MESSAGE);
        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontrado2Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
