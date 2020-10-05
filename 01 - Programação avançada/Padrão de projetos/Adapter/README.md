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
![Adapter]()

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
1. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Singleton/SingletonPattemBD]()
* Neste código é cria uma única instância de um objeto para conectar e desconectar em um banco de dado;

 2. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Singleton/SingletonPattemFile]()
* Neste código é implementado uma classe que manipula um arquivo e aplicando o singleton garante que não havera mais de uma instância dessa classe no programa

