#Author: teste@teste.com.br


Feature: adicionar pruduto no carrinho site magazine Luiza
  Eu como usuario quero pesquisar produto e adicionar no carringo no site da Magazine Luiza

  
  Scenario: pesquisar produto e adicionar no carrinho
    Given que eu esteja na loja Magazine Luiza
    
    When pesquisar produto
    
    Then adiciono no carrinho
    

 
  