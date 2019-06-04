Feature: Seloger Mobile - Accueil

  En tant que Utilisateur 
  	je souhaite ouvrir l application Seloger mobile

  @Connexion
  Scenario: Seloger Mobile - Accueil
  
    Given Ouvrir l application
    And   Verifier la page Accueil
    When  Cliquer sur le bouton Acheter
    When  Cliquer sur ville
    When saisir la ville 
    When Choisir la locatlité
    When cliquer sur suivant
    When taper sur suivant
    When taper encore sur suivant
    When cliquer sur terminer
    Then  la page principale s'affiche
    When Cliquer sur j'ai compris
    When Cliquer sur Compte 
    When cliquer sur Seconnecter
    Then redirection vers la page de connexion 
    When saisir adresse email
    And Saisir le mot de passe 
    When Cliquer sur connectez-vous
    Then retour à la page principale de connexion
  

