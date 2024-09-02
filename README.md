# Análise de Resultados da Olimpíada

## Descrição

O projeto "Análise de Resultados da Olimpíada" é uma aplicação desenvolvida com Spring Boot que visa analisar e gerenciar os resultados das competições da Olimpíada. O sistema integra dados de uma API pública para fornecer informações atualizadas sobre o desempenho dos atletas e suas classificações em eventos olímpicos. A aplicação é estruturada com uma arquitetura em camadas e adota boas práticas de desenvolvimento, como o uso de entidades, serviços e repositórios.

## Objetivo

O principal objetivo deste projeto é criar uma solução que permita:
- **Gerenciar Dados de Atletas**: Armazenar informações sobre os atletas, incluindo seus resultados em eventos específicos.
- **Analisar Resultados**: Facilitar a visualização e análise dos resultados das competições, incluindo a classificação dos atletas em diferentes eventos.
- **Integrar com API Pública**: Consumir dados de uma API pública para obter informações atualizadas sobre os eventos e resultados da Olimpíada.

## Funcionalidades

- **Gerenciamento de Atletas**: CRUD completo (Criar, Ler, Atualizar, Excluir) para atletas.
- **Gerenciamento de Resultados**: CRUD completo para resultados de competições.
- **Integração com API Pública**: Fetch de dados sobre eventos e resultados da Olimpíada usando RestTemplate.
- **Relacionamento entre Entidades**: Entidades `Atleta` e `Resultado` estão inter-relacionadas para refletir a associação entre atletas e seus resultados.

## Estrutura do Projeto

- **Entidades**:
  - `Atleta`: Representa um atleta com atributos como nome e resultados associados.
  - `Resultado`: Representa o resultado de um atleta em um evento específico.

- **Controladores**:
  - `AtletaController`: Gerencia as operações relacionadas aos atletas.
  - `ResultadoController`: Gerencia as operações relacionadas aos resultados.

- **Serviços**:
  - `AtletaService`: Contém a lógica de negócios para manipular os dados dos atletas.
  - `ResultadoService`: Contém a lógica de negócios para manipular os dados dos resultados.

- **Repositórios**:
  - `AtletaRepository`: Interface para acesso a dados de atletas.
  - `ResultadoRepository`: Interface para acesso a dados de resultados.

- **Configuração**:
  - Configuração do Spring Boot para conectar ao banco de dados e configurar o RestTemplate para consumir a API pública.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java baseadas em Spring.
- **Spring Data JPA**: Para manipulação de dados e integração com o banco de dados.
- **RestTemplate**: Para consumo de APIs externas.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.

## Como Executar o Projeto

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/analise-olimpiada.git
   cd analise-olimpiada
   ```

2. **Construir o Projeto**:
   - **Gradle**:
     ```bash
     ./gradlew build
     ```
   - **Maven**:
     ```bash
     mvn clean install
     ```

3. **Executar a Aplicação**:
   ```bash
   ./gradlew bootRun
   ```
   ou
   ```bash
   mvn spring-boot:run
   ```

4. **Acessar a Aplicação**:
   - Navegue até `http://localhost:8080` no seu navegador para acessar a aplicação.

## Endpoints Disponíveis

- **Atletas**:
  - `GET /atletas`: Listar todos os atletas.
  - `POST /atletas`: Adicionar um novo atleta.
  - `PUT /atletas/{id}`: Atualizar um atleta existente.
  - `DELETE /atletas/{id}`: Excluir um atleta.

- **Resultados**:
  - `GET /resultados`: Listar todos os resultados.
  - `POST /resultados`: Adicionar um novo resultado.
  - `PUT /resultados/{id}`: Atualizar um resultado existente.
  - `DELETE /resultados/{id}`: Excluir um resultado.

- **API Pública**:
  - `GET /olimpiada/resultados`: Fetch dos resultados da Olimpíada a partir da API pública.

## Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade para fazer um fork do repositório e enviar pull requests com melhorias ou correções. Certifique-se de seguir as diretrizes de contribuição e escrever testes para qualquer nova funcionalidade adicionada.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).

## Contato

Para mais informações, entre em contato com:

- **Autor**: Antônio Thiago e Hannah Sales
- **Email**: atn.coding@gmail.com 
- **GitHub**: [Antonio-coding](https://github.com/Antonio-coding)  [HannahSales04](https://github.com/HannahSales04)
