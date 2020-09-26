# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão singleton
* Padrão Criacional

## 2. **Intent:**
*  Definir uma, e somente uma instância concorrente de uma classe existira no ciclo de vida 
   da aplicação
## 3. **Motivition:**
* Em caso que precisa controlar a forma como a classe é instanciada.
    * O construtor da classe é protegido
    * Todo o programa usa o Singleton para acessar os comportamento nele definidos.
    * A criação da instância é transparente para o programa.
## 4. **Applicability:**
* Quando houver a necessidade de acesso a um recurso a partir de uma instância.
* Quando há uso em larga escala de um recurso em que se pode ter somente uma instância,
  reduzindo problemas de referência.

## 5. **Structure:**
![Singleton](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/Singleton.png)

## 6. **Participants:**

######    **Singleton:**
* É a única classe deste padrão.
* O construtor é privado, não sendo acessível externamente.

######    **Client:**
* É quem usa o Singleton
* Está interessado na instância, não importa se é uma só no programa todo 

## 7. **Sample Code:**
[github.com/SsmoothSmooth/Estudo/Padrão de projetos/Singleton/SingletonPattemBD](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Singleton/SingletonPattemBD)

 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Singleton/SingletonPattemFile](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Singleton/SingletonPattemFile)


