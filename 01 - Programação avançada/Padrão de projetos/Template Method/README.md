
# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão Template Method
* Padrão Comportamental

## 2. **Intent:**
* Permite que as subclasses façam modificações deste algoritimo sem alterar a estrutura

## 3. **Motivition:**
* Alterações no algoritmo pode ser feitas de forma genérica ou específica em cada componente específico

## 4. **Applicability:**
* Aplicação que possui estrutura hierárquica e um algoritmo que pode ser dividido em etapas.
* Dois ou mais componentes diferentes implementam esse algoritmo, possuindo várias
  semelhanças mas alguns diferenças na implementação de algumas etapas do algoritmo.
* Alterações no algoritmo pode ser feitas de forma genérica ou específica e mcada componente específico
* Útil em cenários em que se tem gerador automático de código.

## 5. **Structure:**
![TemplateMethod](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/TemplateMethod.png)

## 6. **Participants:**

######    **FrameworkClass:**
* Define o templateMethod que é responsável por chamar os demais métodos.
* Especifica os métodos abstratos das etapas de execução

######    **ApplicationClassOne/ApplicationClassTwo:**
* Redefine, quando necessário, algumas etapas do algoritmo especificado em FrameworkClass

###### 7. **Sample Code:**
[github.com/SsmoothSmooth/Estudo/Padrão de projetos/Template Method/templateMethod](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Template%20Method/templateMethodExemple)

 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Template Method/templateMethod2](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Template%20Method/templateMethodExemple2)

 [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Template Method/templateMethod3](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Template%20Method/templateMethodExemple3)

