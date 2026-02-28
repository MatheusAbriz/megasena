# Projeto Megasena

Aplicativo Android simples que realiza o sorteio de 6 números aleatórios de 1 a 60.

## Funcionalidades

- Sorteia 6 números aleatórios ao clicar no botão **Sorteio**
- Exibe os números em 6 campos na tela
- Botão **Limpar** reseta os números exibidos
- Números gerados entre 1 e 60

## ▶ Como funciona

O método `sorteioNumero()`:
- Gera 6 números usando `Random`
- Atualiza os 6 `TextView` na tela

O método `limpaNumeros()`:
- Reseta os campos para "-"
- Limpa o texto de resultado
