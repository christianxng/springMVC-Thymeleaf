<h1 align="center"> Estudos Spring MVC + Thymeleaf  </h2>
<h2 align="center"> Gerenciamento Administrativo </h2>

Projeto desenvolvido com auxílio de um curso da Udemy. 
Sistema básico de gerenciamento de departamentos, cargos e funcionários de uma empresa.  


## Estudos: 



- Aplicações web com o Spring MVC
- Mapeamento objeto-relacional com JPA
- Implementada a camada de persistência com o padrão DAO
- Validação de formulários no lado servidor com Bean Validation
- Views baseadas no template Thymeleaf
- Recursos estáticos (CSS e JS) via WebJars


### Regras de Negócio

- Cada cargo para ser cadastrado tem que ser vinculado a um departamento existente. (Nenhum departamento pode ser excluido caso tenha algum cargo vinculado.)
- Cada funcionário deverá ser cadastrado com algum cargo existente. 
- Formulários devem ser cadastrados da maneira correta. Caso não respeite as regras de validação, nenhum será salvo ou editado. 

### Sistemas

- Adição
- Edição
- Exclusão
- Busca
** (Funcionário) por: 
- nome (pode ser partes de um nome)
- cargo
- datas de admissão e/ou demissão.


### A estudar

- Paginação back-end nas tabelas de dados
