
/*Crie uma aplicação onde o usuário cadastra seus dados pessoais e os dados do seu veículo pessoal e o programa exibe os dados do veículo na tela.
         * NOTE: Use o conceito de composição, onde um dos atributos de veículo é o proprietário.
         */

package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Proprietario;

import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) {
        String[] opcoes = {"Cadastrar veículo", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if ("Cadastrar veículo".equals(opcao)) {
                String nome = JOptionPane.showInputDialog("Informe o nome do proprietário:");
                String modelo = JOptionPane.showInputDialog("Informe o modelo do veículo:");

                Proprietario proprietario = new Proprietario();
                proprietario.setNome(nome);

                Veiculo veiculo = new veiculo();
                veiculo.setModelo(modelo);
                veiculo.setProprietario(proprietario);

                JOptionPane.showMessageDialog(null, "Proprietário: " + veiculo.getProprietario().getNome() +"\nVeículo: " + veiculo.getModelo(),"Cadastro realizado",JOptionPane.INFORMATION_MESSAGE);
            }

        } while (!"Sair".equals(opcao));
    }
}
