# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão Adapter
* Padrão Estrutural

## 2. **Intent:**
*  Permitir isolar parte de Software, normalmente quando se tem um código
   legado a ser integrado a outro código de uma aplicação em particular. Nesses cass é necessário uma adapatação para garantirque as partes se comuniquem sem contaminar a estrutura de código ambas as partes ou acesso ao código fonte.

## 3. **Motivition:**
* Converter a interface de uma classe em outra interface, esperada pelos clientes.
* Adapter permite que as classes com interfaces incompatíveis trabalhem em conjunto.
## 4. **Applicability:**
* Quando se tem que integrar sistema legado ao novo sistema.
* Quando se precisa conectar uma biblioteca de classes, muitas vezes em formato antigo, sem impactar a estrutura do novo sistema.
* Você deseja criar uma classe reutilizável que coopere com classes não relacionadas ou não-previstas.
* Muito utilizado para compatibilizar o novo sistema com Frameworks ou APIs externos.

## 5. **Structure:**
![Adapter](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/Adapter.png)
![AdapterE](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/AdapterE.png)


## 6. **Participants:**

######    **Target:**
* Define o interface do domínio usada pelo cliente.

######    **Client:**
* Usa o objeto da interface Target conforme definido.
* Visualiza somente o Target. 

######    **Adaptee:**
* Define uma interface ou contrato existente que precisa ser adaptado.

######    **Adapter:**
* É quem adapta a interface do Adeptee ao Target usando pela aplicação. 

## 7. **Sample Code:**
1. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Adapter/AdapterPatterm/](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Adapter/AdapterPatterm)
* Neste exemplo clássico, usamos uma classe de tomada de dois pinos se adapter a uma tomada de três pino.
