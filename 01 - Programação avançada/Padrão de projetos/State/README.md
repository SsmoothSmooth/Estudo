# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão state
* Padrão Comportamental

## 2. **Intent:**
*  Permite que um objeto altere o seu comportamento quando o seu estado interno muda.

## 3. **Motivition:**
* O padrão State é motivado por aqueles objetos que, em seu estado atual, varia o seu comportamento devido as diferentes mensagens que possa receber. Como exemplo, tomamos uma classe Livro, um objeto desta classe terá respostas diferentes, dependendo do seu estado(Disponível ou Emprestado). Por exemplo invocando o método reservar de um objeto da classe Livro seu comportamento será diferente, se o Livro está no estado Disponível ou no estado Emprestado.

## 4. **Applicability:**
* Quando um determinado objeto tem estados e responsabilidades diferentes, dependendo de qual estado você está em determinado momento.
* Pode ser usada para simplificar os casos em que há código complicado e extenso de decisão que depende do estado do objeto

## 5. **Structure:**
![state](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/State.png)

## 6. **Participants:**

######    **Context:**
* define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do objeto.

######    **State:**
* Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto.

######    **ConcreteState:**
* Um ou mais estados concretos que implementam a interface estado.

## 7. **Sample Code:**
1. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/State/StatePatten/](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/State/StatePatten)
 * Neste codigo a classe mario possui uma referência para um objeto estado, este estado vai ser atualizado de acordo com as operações de troca de estados. Quando uma operação for invocada, o objeto estado vai executar a operação e se atualizará automaticamente. Veja o fluxo nesse UML
 ![stateMario](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/MarioState.png)
