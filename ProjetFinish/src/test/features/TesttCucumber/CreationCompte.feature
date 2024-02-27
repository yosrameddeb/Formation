
@tag
Feature: creation compte

je veux creer un compte en tant que utilisateur 

  @tag1
  Scenario: creation compte 
    Given saisir URL de site "https://automationexercise.com/"
    And creer nom "yosra"
    And creer mail "yosra@yahoo.fr"
    And click sur le bouton signup
    Then verification information account 
    And creer password "yosrbib"
    And creer date de naissance
    And select chekbox newsleter
    And select chekbox Receive special offers partners
    And creer first name : "first name", last name: "last name", company: "company", adress:"adress"
    And fill again country: "country", state:"state", city:"city", zipcod:"zipcod", mobile number:"mobile number"
    And cliquer sur le bouton creer compte
    Then verifier que le compte est creer 