package bddfiap;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.*;

public class Stepdefs {

    @Dado("Que cliente {string} VISITA a pagina do site com a senha {string} como {string}")
    public void que_cliente_VISITA_a_pagina_do_site_com_a_como(String login, String senha, String tipoVisita) {
        String tipoVisitante = Autenticacao.logarUsuario(login, senha);

        assertEquals(tipoVisitante, tipoVisita);
    }

    @Quando("O cliente pesquisa por um produto {string}")
    public void o_cliente_pesquisa_por_um_produto(String produto) {
        Produtos produtos = new Produtos();
        // "Produto disponivel"
        String disponibilidade = produtos.pesquisar(produto);
        if (disponibilidade.equals("Produto disponivel")) {
            assertEquals(disponibilidade,"Produto disponivel");
        }
        // "Produto nao disponivel"
        if (disponibilidade.equals("Produto nao disponivel")) {
            assertEquals(disponibilidade, "Produto nao disponivel");
        }
    }

    @Entao("Deve ser consultado o estoque do produto {string}")
    public void deve_ser_consultado_o_estoque_do_produto(String produto) {
        Produtos produtos = new Produtos();
        // Se o Produto for nao disponivel, cenario nao deve continuar
        // "Produto disponivel"
        Integer quantidade = produtos.estoque(produto);
        assertNotNull(quantidade);
    }

    @Entao("Retornar a quantidade de Produtos {string} Disponiveis em estoque de cada loja: {string}")
    public void retornar_a_quantidade_de_Produtos_Disponiveis_em_estoque_de_cada_loja(String produto, String resultadoEsperado) {
        Lojas lojas = new Lojas();
        String disponibilidade = lojas.pesquisar(produto);
        assertEquals(disponibilidade, resultadoEsperado);
    }

    @Dado("Que cliente FEZ LOGIN na pagina do site")
    public void que_cliente_FEZ_LOGIN_na_pagina_do_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("O cliente adiciona um produto ao carrinho de compras")
    public void o_cliente_adiciona_um_produto_ao_carrinho_de_compras() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entao("O produto fica reservado por {int} minutos")
    public void o_produto_fica_reservado_por_minutos(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("Cliente tem itens no seu Carrinho de Compras")
    public void cliente_tem_itens_no_seu_Carrinho_de_Compras() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("O cliente finaliza a compra")
    public void o_cliente_finaliza_a_compra() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entao("Emite as opcoes de pagamento")
    public void emite_as_opcoes_de_pagamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("Que cliente finalizou a compra do seu Carrinho de Compras")
    public void que_cliente_finalizou_a_compra_do_seu_Carrinho_de_Compras() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("Escolhe a opcao de pagamento")
    public void escolhe_a_opcao_de_pagamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("clica em finalizar Pagamento")
    public void clica_em_finalizar_Pagamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entao("O pagamento tem que ser concluido com sucesso")
    public void o_pagamento_tem_que_ser_concluido_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
