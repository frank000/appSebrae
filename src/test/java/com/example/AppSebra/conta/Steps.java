package com.example.AppSebra.conta;

import com.example.AppSebra.AbstractDefinition;
import com.example.AppSebra.AppSebraApplication;
import com.example.AppSebra.AppSebraApplicationTests;
import com.example.AppSebra.app.web.persistence.repository.ContaRepository;
import com.example.AppSebra.app.web.service.ContaServiceImpl;
import com.example.AppSebra.core.entity.Conta;
import com.example.AppSebra.core.service.ContaService;
import com.example.AppSebra.http.AbstractSteps;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@ActiveProfiles("dev")
public class Steps extends AbstractSteps {

    private Conta conta;
    private Conta contaRecebida;
    private Conta contaEsperada;
    private String contasUrl = "/contas";


    @Autowired
    private ContaServiceImpl service;

    @Test
    @Given("Aplicacao recebeu nome e descricao de conta;")
    public void aplicacao_recebeu_nome_e_descricao_de_conta() {
        testContext().reset();
        this.conta =  new Conta("Fulano de tal",  "Descrição válida para o user");
        super.testContext()
                .setPayload(  this.conta );



    }
    @Test
    @When("Aplicacao salva")
    public void aplicacao_salva() {
//        this.conta =  new Conta("Fulano de tal",  "Descrição válida para o user");
//        this.contaEsperada = new Conta(1l,"Fulano de tal",  "Descrição válida para o user");
//        this.contaRecebida = service.salvar(this.conta);

//        super.testContext()
//                .setPayload(  this.conta );
        executePost(contasUrl);
    }
    @Test
    @Then("Aplicacao mostra objeto não nulo e com ID esperado")
    public void aplicacao_mostra_objeto_com_id_nome_descricao() {
        Assertions.assertNotNull(this.contaRecebida.getId());
        Assertions.assertEquals(this.contaRecebida.getId() , this.contaEsperada.getId());
    }
}
