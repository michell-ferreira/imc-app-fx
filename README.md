# Calculadora de IMC em JavaFX 🧮

![Java](https://img.shields.io/badge/Language-Java-orange)
![JavaFX](https://img.shields.io/badge/GUI-JavaFX-blue)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Platform](https://img.shields.io/badge/Platform-Desktop-lightgrey)

Projeto de uma aplicação desktop desenvolvida em JavaFX para cálculo do IMC (Índice de Massa Corporal), criada para aplicar e consolidar conceitos fundamentais de Java, Programação Orientada a Objetos e desenvolvimento de interfaces gráficas.

---

## 🎥 Demonstração em Vídeo

<a href="https://www.youtube.com/watch?v=Ur_GMldGA9M" target="_blank">Assista a uma demonstração da aplicação em funcionamento</a>

---

## 📜 Sobre o Projeto

Este projeto foi desenvolvido como um exercício prático para consolidar o uso do JavaFX em aplicações desktop. A aplicação permite ao usuário informar peso e altura, realiza o cálculo do IMC utilizando a fórmula padrão `peso / (altura²)` e exibe o resultado acompanhado de sua classificação conforme os intervalos definidos pela Organização Mundial da Saúde (OMS).

O foco foi a criação de uma interface simples, funcional e visualmente organizada, com validação de dados, tratamento de exceções e separação entre lógica, interface gráfica e estilização via CSS.

## ✨ Funcionalidades

* Inserção de peso e altura com suporte a ponto ou vírgula
* Cálculo automático do IMC
* Classificação automática por faixas (OMS)
* Feedback visual com cores conforme o resultado
* Tratamento de entradas inválidas
* Botão para limpeza rápida dos campos

## 💡 Destaque da Implementação

O principal destaque do projeto é o **feedback visual dinâmico**, onde a cor do resultado muda conforme a classificação do IMC, tornando a interpretação mais rápida e intuitiva para o usuário. Essa abordagem demonstra a integração entre lógica de negócio e interface gráfica utilizando JavaFX e CSS.

## 🚀 Como Executar o Projeto

```bash
# 1. Clone o repositório
git clone https://github.com/michell-ferreira/IMCAppFX

# 2. Acesse a pasta do projeto
cd IMCAppFX

# 3. Execute a aplicação
mvn javafx:run
```

## ✒️ Autor

**Michell Ferreira**

* **GitHub:** [michell-ferreira](https://github.com/michell-ferreira)
* **LinkedIn:** [ferreira-michel](https://www.linkedin.com/in/ferreira-michel/)

---
