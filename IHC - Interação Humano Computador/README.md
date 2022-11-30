<div align="center">
  
![fatecsjc_400x192](https://user-images.githubusercontent.com/71477357/161321048-dc637b2e-0314-4e07-b2f9-8cda9f653356.png)

<h1 align="center"> :computer: Interação Humano Computador </h1>
<p align="center">
  
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=flat"/>
<img src="https://img.shields.io/badge/ÚLTIMA%20MODIFICAÇÃO-NOVEMBRO%20DE%202022-brightgreen&style=flat"/>

<p align ="center">
    <a href="#home"> Sobre </a> -
    <a href="#acertos"> Exemplo de Acertos </a> -
    <a href="#erros"> Exemplo de Erros </a> -
    <a href="#aplicacoes"> Aplicações </a>
  
</div>

<span id = "home">

<h1 align="center"> Heurísticas de Nielsen e WCAG </h1>

Atividade para realizar uma avaliação Heurística com base no [WCAG](https://www.w3.org/WAI/WCAG21/quickref/), localizando os erros e acertos encontrados a partir da aplicação dos princípios de usabilidade, acessibilidade e atratividade dos sites, destacando a Guideline avaliada e o que está certo ou errado.

  
<span id = "acertos">

## Exemplos de acertos

<details>
<summary><b>1. Visibilidade do status do sistema</b></summary>
<br>
 O sistema deve mostrar o que está acontecendo em tempo real pro usuário, um exemplo disso é a interface das playlists Youtube, que ficam ao lado direito do vídeo, mostrando qual vídeo da lista estamos assistindo, qual os próximos e quais já foram assistidos

![visibilidade](https://user-images.githubusercontent.com/71477357/204688242-2ac2925a-d755-4494-8715-6424d343bb46.JPG)

</details>

<details>
<summary><b>3. Controle e liberdade para o usuário</b></summary>
    <br>
    O sistema deve permitir que o usuário tenha liberdade para realizar ações que ele deseja, mas em caso de acionar alguma ação por engano, deve haver um modo de desfazer (sair de uma janela indesejada ou retornar a um ponto anterior). Um exemplo é a ação de “desfazer” do Google quando a ação é exclusão de um e-mail.

<div align="center">
    <img alt="174390768-69c3d030-04cb-4148-a292-b4146723795d" src="https://user-images.githubusercontent.com/71477357/204778639-9836f10b-d964-4707-a9d1-8ef331aba57d.png"
<div>

<div align="left">
</details>  
  
<details>
<summary><b>5. Prevenções de erros</b></summary>
    <br>
    Melhor que deixar o usuário resolver um erro é evitar que ele cometa erros, um exemplo disso é a busca do Google, que enquanto estamos digitando na barra de pesquisa ele apresenta algumas sugestões mas também corrigindo erros de ortografia caso tenhamos pesquisado algo errado.
  
<div>
  
<div align="center">

  ### Realizando uma busca no Google
  
![Interação](https://user-images.githubusercontent.com/71477357/204780210-6749f688-f32d-4c8e-9c7c-3c9a0c4db1fc.PNG) 
  
  ### Resultado da busca com erro de ortografia
  
![Interação2](https://user-images.githubusercontent.com/71477357/204785203-d9e58b47-15eb-4a90-8fb1-5f0d9e16499e.PNG)
<div>

<div align="left">


</details>
  
<span id = "erros">
  
## Exemplos de erros

<details>  
<summary><b>1. Erro de Responsividade</b></summary>

> Desktop:
>
> <img heigh="800px" width="1000px" src ="https://github.com/drisabelles/bertoti/blob/main/IHC/images/WCAG-D3.png">
>
>
> Mobile:
>
> <img heigh="400px" width="400px" src ="https://github.com/drisabelles/bertoti/blob/main/IHC/images/WCAG-D4.png">
>
> Página que não tem adaptação alguma para outros dispostivos se não o desktop.  
</details>

<details>  
<summary><b>2. Erro de Visualização</b></summary>

>
> <img heigh="800px" width="1000px" src ="https://user-images.githubusercontent.com/71477357/204783971-2d4bd0c5-f475-43e5-92b1-7ae80fb6abb1.png">
>
>pode causar confusão ao usuário por não facilitar a identificação de sua localização no site nem as ações permitidas claramente; não é minimalista, pelo contrário, utiliza exageradamente de informações e elementos na tela, causando cansaço mental ao interagir com o site e não estabelecendo harmonia visual; não há a presença de padrões, não há familiaridade do usuário com as funcionalidades disponíveis
</details>
  
<span id = "aplicacoes">
  
## Aplicação dos conceitos de IHC no API

A partir de discussões com o professor Giuliano Bertoti, foi possível observar a aplicação de diversas heurísticas de Nielsen mas também conceitos do WCAG. Abaixo estão listadas algumas dessas observações:

<details>
   <summary><b>1. Visibilidade do status do sistema</b></summary>
    <br>
    Para sempre ter controle sobre o status do sistema e seus componentes, um dos mecanismos é sempre haver o status do chamado em todas as telas relacionadas a ele (seja em listagens, como a da captura abaixo, ou em telas como "detalhes do chamado").

  <div align="center">
   <img alt="Tela home com os status de cada chamado na listagem" src="[https://user-images.githubusercontent.com/69374340/174399624-76996515-6532-486a-aa4b-464637c9be2d.png](https://user-images.githubusercontent.com/71477357/204787746-0b0d44e4-0d6c-4829-bb8c-030a49872320.png)">
  </div>
</details>

<details>
   <summary><b>3 Controle e liberdade para o usuário</b></summary>
    <br>
    Para conferir mais liberdade para o usuário, até mesmo como prevenção de erros, foi implementado algumas funcionalidades de alteração, atualização ou mesmo exclusão, como por exemplo a alteração da prioridade do chamado por parte de usuários suporte, como nas imagens a seguir:

<div align="center">

|                                                                                                          Detalhes do chamado                                                                                                          |                                                                     Alteração da prioridade do chamado                                                                      |
| :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| <img alt="Opção de alteração de prioridade do chamado na tela de detalhes do chamado visualizada por um usuário suporte" src="https://user-images.githubusercontent.com/69374340/174398967-8c2fa3d4-287c-4822-8aab-67ebbabf8581.png"> | <img alt="Dropdown para escolha da nova prioridade do chamado" src="https://user-images.githubusercontent.com/69374340/174399422-cf318d96-5a2d-4737-9640-99961c276218.png"> |

</div>

</details>

<details>
   <summary><b>4. Consistência e padronização & 8. Estética e degign minimalista</b></summary>
    <br>
    Com a finalidade de promover foco ao usuário, evitando telas com muitos elementos, ou componentes com animações e muitos efeitos visuais, adotamos uma estética minimalista ao sistema, além de padronizada, como no exemplo do formulário abaixo. Outros formulários do sistema, como cadastro de chamados ou de equipamentos, seguem o mesmo layout.

  <div align="center">
   <img alt="Cadastro de usuários com apenas o suficiente em tela para tal ação" src="https://user-images.githubusercontent.com/69374340/174398534-99ceafaa-8c7c-4683-bb4c-408e776d6295.png">
  </div>
</details>

<details>
   <summary><b>5. Prevenção de erros</b></summary>
    <br>
    Visando evitar erros, bem como avisar o usuário que a ação que ele está realizando não é correta, no API aplicamos um alerta caso ele tente realizar uma pesquisa em branco durante uma busca de uma palavra chave no centro de soluções, como na captura de tela abaixo:

  <div align="center">
    <img alt="Alerta para pesquisas em branco" src="https://user-images.githubusercontent.com/69374340/174397922-748c727d-c2ad-4ccb-a1e0-0bc636961b29.png">
  </div>
</details>
