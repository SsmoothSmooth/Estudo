
# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão Composite
* Padrão Estrutural

## 2. **Intent:**
* Modifica a estruttura de um objeto

## 3. **Motivition:**
* Para casos que requerem objetos que se comportam como estrutura em árvore para
    representar hierarquias.

## 4. **Applicability:**
* Em estrutura hierárquica como grafo ou árvore que requer funcionalidade genérica por toda a estrutura
    Aplicações onde precisa agregar dados por toda hierárquias.
    Aplicção que precisa tratar a composição e objetodos de maneira individuais e  uniforme

## 5. **Structure:**

 ![Structure Composite Basic](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/structureComposite.png)

## 6. **Participants:**

######    **Component:**
* Declara interface para objetos da composição
* Implementa comportamentos padrão comuns para todas as classes
* Declara uma interface para acessar e gerenciar componentes filho

######    **Leaf:**
* Representa objetos folha da consição que não tem filhos
* Define o comportamento para objetos primitivos.

######    **Composite:**
* Define o comportamento para componentes que possuem filhos
* Armazena componentes filhos
* Implementa operações relacionadas a filhos e definidas na interface Component

######    **Client**
* Manipula os objetos da composição via interface Component    

###### 7. **Sample Code:**
 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/CompositePatten](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Composite/CompositePatten)

 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/CompositePatten2](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Composite/CompositePatten2)

 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/CompositePatten3](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Composite/CompositePatten3)
