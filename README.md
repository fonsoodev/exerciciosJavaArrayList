#  Exercícios de POO & Coleções em Java (Meu Laboratório de Código)

Uma coleção de simulações e desafios práticos desenvolvidos em Java para dominar os fundamentos de Programação Orientada a Objetos (POO), manipulação de memória RAM e estruturas de dados elásticas (`ArrayList`).

Projetos desenvolvidos durante o curso "Java: trabalhando com listas e coleções de dados" da Alura, como parte da minha trilha de preparação intensiva para o **Geração Caldeira 2026**!

---

## Conceitos Fundamentais Consolidados

Após horas de tela, quebrando a cabeça e aplicando técnicas de estudo ativo (como o Método Feynman), consegui internalizar e blindar os seguintes pilares da engenharia de software:

* **Abstração & Classes:** Modelagem do mundo real para o código (Produtos, Formas Geométricas, Animais e Contas).
* **Encapsulamento Pragmático:** Proteção de atributos com modificadores `private`, liberando o acesso controlado via *Getters* ou utilizando os modernos `Records`.
* **Polimorfismo em Coleções:** Uso de `ArrayList<ClasseMae>` ou `ArrayList<Interface>` para criar esteiras rolantes que aceitam qualquer classe filha de forma democrática.
* **Mecânica de Memória (Casting):** * **Upcasting:** Olhar para o filho como se fosse a mãe (o Java faz no automático).
  * **Downcasting:** Recuperar os poderes específicos do filho escondidos sob a máscara da classe mãe através da sintaxe de parênteses `(ClasseFilha)`.
* **Segurança de Tipos (`instanceof`):** O "segurança de balada" que analisa a estrutura física do objeto em tempo de execução, evitando o temido erro fatal `ClassCastException` (ex: tentar enfiar os óculos de um `Cachorro` em uma `Girafa`).
* **Sobrescrita de Métodos (@Override):** Customização cirúrgica do método `.toString()` para limpar o console e cuspir dados legíveis em vez de referências hexadecimais de memória.

---

## Estrutura dos Desafios Instalados

O repositório está dividido em pacotes estratégicos dentro de `exercicios/`:

### 1. `exercicios.mediaProdutos` (O Algoritmo do Cupom Fiscal)
* **O que faz:** Simula a esteira de um caixa de supermercado (PDV). Ele percorre um `ArrayList` de produtos, extrai o preço de cada um via `getPreco()` e acumula o valor em uma variável global para calcular a média e o total.
* **Estalo Mental:** Descobri que uma nota fiscal de mercado nada mais é do que um laço `for-each` coletando os atributos de objetos guardados em uma lista!

### 2. `exercicios.animaisListaCasting` (O Teste de DNA com `instanceof`)
* **O que faz:** Um laboratório de testes destrutivos. Cria uma lista genérica de `Animal` contendo cachorros e uma girafa (`Melman`). Usa o *Pattern Matching para `instanceof`* para fazer a checagem de tipo e o Downcasting na mesma linha com segurança máxima.
* **Estalo Mental:** Entendi a diferença entre o controle remoto que o Java usa para olhar o objeto (`Animal`) e o que o objeto realmente é na memória RAM (`Cachorro`).

### 3. `exercicios.contas` (O Auditor de Saldos Bancários)
* **O que faz:** Cria uma lista de contas bancárias com saldos variados e roda um loop inteligente de alta performance para descobrir qual conta possui o maior saldo.
* **Diferencial Técnico:** Diferente de estruturas engessadas com múltiplos `if/else` manuais, este algoritmo é 100% escalável — funciona perfeitamente para 3 contas ou para 3 milhões de contas, mantendo a elegância do código.

---

## 📓 Diário de Bordo & Notas de Aprendizado

> 💡 **Nota do Desenvolvedor:** O código fonte deste repositório mantém, intencionalmente, comentários detalhados, anotações de fluxo e testes de colapso de código (comentados). Usei o terminal como um verdadeiro laboratório de cientista maluco para registrar meus estalos mentais e garantir que eu nunca mais dependa de decoreba de sintaxe.

---

## Autor

Desenvolvido com muita cafeína, foco e consistência por:

* **Afonso (fonsoodev)**
* ☕ **Mindset:** "Se você não entendeu de primeira, pare, descanse, use o modo difuso e depois explique para si mesmo como se estivesse ensinando uma criança."

---
*Gerado em maio de 2026 como registro público de evolução técnica.*
