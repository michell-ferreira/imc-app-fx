package org.example;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Main extends Application {


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) {
        //Labels ou etiquetas
        Label labelPeso = new Label("Peso");
        Label labelAltura = new Label("Altura");

        // Campos de textos para entrada de dados
        TextField fieldPeso = new TextField(); // field vem como String então precisa parsear
        fieldPeso.setPromptText("Peso em KG"); // Praticamente um placeholder
        TextField fieldAltura = new TextField();
        fieldAltura.setPromptText("Altura em Metros");

        // Label que mostra o resultado do IMC
        Label labelResultado = new Label();

        // Botão para calcular o IMC
        Button buttonCalcular = new Button("Calcular IMC");
        buttonCalcular.setOnAction(e -> {
            try {
                double peso = Double.parseDouble(fieldPeso.getText().replace(",", ".")); // Parse do field
                double altura = Double.parseDouble(fieldAltura.getText().replace(",", "."));

                double imc = peso / (altura * altura);

                String classificacao;

                if (imc < 17) {
                    classificacao = "Muito abaixo do peso";
                } else if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc < 25) {
                    classificacao = "Peso normal";
                } else if (imc < 30) {
                    classificacao = "Acima do peso";
                } else if (imc < 35) {
                    classificacao = "Obesidade I";
                } else if (imc < 40) {
                    classificacao = "Obesidade II (severa)";
                } else {
                    classificacao = "Obesidade III (mórbida)";
                }

                labelResultado.setText(String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao));
            } catch (NumberFormatException ex) {
                labelResultado.setText("Por favor, insira números válidos para peso e altura.");
            }

        });

        // Botão para limpar todos os campos
        Button buttonClear = new Button("Limpar");
        buttonClear.setOnAction(e -> {
            fieldAltura.setText("");
            fieldPeso.setText("");
            labelResultado.setText("");
            fieldPeso.requestFocus();
        });

        // Layout vertical Vbox onde 10 é o espaçamento vertical
        VBox layout = new VBox(10, labelPeso, fieldPeso, labelAltura, fieldAltura, buttonCalcular, labelResultado, buttonClear);

        // Insets é necessário, é igual ao padding do front EX: new Insets(10, 20, 10, 20); // top, right, bottom, left
        layout.setPadding(new Insets(15));

        // Alinha ao centro
        layout.setAlignment(Pos.CENTER);

        // Scene e Stage
        Scene scene = new Scene(layout, 400, 300);
        stage.setTitle("Calculadora IMC");
        stage.setScene(scene);
        stage.show();
    }
}