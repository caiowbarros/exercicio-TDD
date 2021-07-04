# Exercício TDD
Exercício feito para a matéria de Qualidade e Teste
## Instruções
- Implementar um processador de boletos usando o TDD
- O objetivo é verificar todos os boletos e, caso o valor da soma de todos seja maior ou igual ao valor da fatura, então essa fatura deverá ser considerada como paga
- Exemplos de processamento:
    - Fatura de 1.500,00 com 3 boletos nos valores de 500,00, 400,00 e 600,00: fatura marcada como PAGA e três pagamentos do tipo BOLETO criados
    - Fatura de 1.500,00 com 3 boletos nos valores de 1000,00, 500,00 e 250,00: fatura marcada como PAGA e três pagamentos do tipo BOLETO criados
    - Fatura de 2.000,00 com 2 boletos nos valores de 500,00 e 400,00:fatura não marcada como PAGA e dois pagamentos do tipo BOLETO criados
- Usar o GitHub para enviar ("commitar") cada nova iteração