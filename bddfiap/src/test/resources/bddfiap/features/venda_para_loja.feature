# language: pt
@venda_para_loja
Funcionalidade: Venda de produtos para Loja
  Descrição da funcionalidade, preferencialmente atrelando a feature ao valor gerado para a organização

  @verificar_disponibilidade_produto
  #Scenario Outline: cliente quer testar
  Esquema do Cenario: Cliente quer verificar disponibilidade de um produto
    Dado Que cliente <login> VISITA a pagina do site com a senha <senha> como <tipo Visita>
    Quando O cliente pesquisa por um produto <produto>
    Entao Deve ser consultado o estoque do produto <produto>
    E Retornar a quantidade de Produtos <produto> Disponiveis em estoque de cada loja: <resultado esperado>
    Exemplos:
    | login     | senha      | tipo Visita           | produto   | resultado esperado                |
    | "usuario" | "teste"    | "Visitante"           | "Prod 1"  | "Loja 1 tem 3 unidades do Prod 1" |
    | "usuario" | "senha"    | "Usuario autenticado" | "Prod 2"  | "Loja 1 tem 5 unidades do Prod 2" |
    | "usuario" | "test"     | "Visitante"           | "Prod 3"  | "Loja 2 tem 2 unidades do Prod 3" |
    | "usuario" | "password" | "Visitante"           | "Prod 4"  | "Loja 2 tem 6 unidades do Prod 4" |
    | "usuario" | "senha"    | "Usuario autenticado" | "Prod 5"  | "Produto não disponível"          |

  @seleciona_produto_comprar
  Cenario: Cliente seleciona um produto e adiciona ao Carrinho de compras
    Dado Que cliente FEZ LOGIN na pagina do site
    Quando O cliente adiciona um produto ao carrinho de compras
    Entao O produto fica reservado por 15 minutos

  @finaliza_compra_produto
  Cenario: Cliente finaliza a compra do seu Carrinho de compras
    Dado Que cliente FEZ LOGIN na pagina do site
    E Cliente tem itens no seu Carrinho de Compras
    Quando O cliente finaliza a compra
    Entao Emite as opcoes de pagamento

  @finaliza_pagamento
  Cenario: Cliente efetua o pagamento
    Dado Que cliente finalizou a compra do seu Carrinho de Compras
    Quando Escolhe a opcao de pagamento
    E clica em finalizar Pagamento
    Entao O pagamento tem que ser concluido com sucesso
