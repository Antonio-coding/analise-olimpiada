Análise de Resultados da Olimpíada
Descrição
O projeto "Análise de Resultados da Olimpíada" é uma aplicação desenvolvida com Spring Boot que visa analisar e gerenciar os resultados das competições da Olimpíada. O sistema integra dados de uma API pública para fornecer informações atualizadas sobre o desempenho dos atletas e suas classificações em eventos olímpicos. A aplicação é estruturada com uma arquitetura em camadas e adota boas práticas de desenvolvimento, como o uso de entidades, serviços e repositórios.

Objetivo
O principal objetivo deste projeto é criar uma solução que permita:

Gerenciar Dados de Países: Armazenar informações sobre os países, incluindo seus resultados em eventos específicos.
Analisar Resultados: Facilitar a visualização e análise dos resultados das competições, incluindo a classificação dos países em diferentes eventos.
Integrar com API Pública: Consumir dados de uma API pública para obter informações atualizadas sobre os eventos e resultados da Olimpíada.
Funcionalidades
Gerenciamento de Países: CRUD completo (Criar, Ler, Atualizar, Excluir) para países.
Gerenciamento de Disciplinas: CRUD completo para disciplinas das competições.
Integração com API Pública: Fetch de dados sobre eventos e resultados da Olimpíada usando RestTemplate.
Relacionamento entre Entidades: Entidades Country (País) e Discipline (Esporte) estão inter-relacionadas para refletir a associação entre países e seus resultados.
Estrutura do Projeto

Entidades:
Country: Representa um país com atributos como nome e código de três letras.
Discipline: Representa uma disciplina esportiva com seus detalhes.

Controladores:
CountryController: Gerencia as operações relacionadas aos países.
DisciplineController: Gerencia as operações relacionadas às disciplinas.

Serviços:
CountryService: Contém a lógica de negócios para manipular os dados dos países.
DisciplineService: Contém a lógica de negócios para manipular os dados das disciplinas.

Repositórios:
CountryRepository: Interface para acesso a dados de países.
DisciplineRepository: Interface para acesso a dados das disciplinas.

Configuração:
Configuração do Spring Boot para conectar ao banco de dados e configurar o RestTemplate para consumir a API pública.
Tecnologias Utilizadas
Spring Boot: Framework para desenvolvimento de aplicações Java baseadas em Spring.
Spring Data JPA: Para manipulação de dados e integração com o banco de dados.
RestTemplate: Para consumo de APIs externas.
H2 Database: Banco de dados em memória para desenvolvimento e testes.
Como Executar o Projeto

Clonar o Repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/analise-olimpiada.git
cd analise-olimpiada
Construir o Projeto:

Gradle:
bash
Copiar código
./gradlew build
Maven:
bash
Copiar código
mvn clean install
Executar a Aplicação:

bash
Copiar código
./gradlew bootRun
ou

bash
Copiar código
mvn spring-boot:run
Acessar a Aplicação:

Navegue até http://localhost:8080 no seu navegador para acessar a aplicação.
Endpoints Disponíveis
Países:

GET /countries: Listar todos os países.
POST /countries: Adicionar um novo país.
PUT /countries/{id}: Atualizar um país existente.
DELETE /countries/{id}: Excluir um país.
Disciplinas:

GET /disciplines: Listar todas as disciplinas.
POST /disciplines: Adicionar uma nova disciplina.
PUT /disciplines/{id}: Atualizar uma disciplina existente.
DELETE /disciplines/{id}: Excluir uma disciplina.
API Pública:

GET /olympics/results: Fetch dos resultados da Olimpíada a partir da API pública.
Contribuição
Se você deseja contribuir para este projeto, sinta-se à vontade para fazer um fork do repositório e enviar pull requests com melhorias ou correções. Certifique-se de seguir as diretrizes de contribuição e escrever testes para qualquer nova funcionalidade adicionada.

Licença
Este projeto é licenciado sob a Licença MIT.

Contato
Para mais informações, entre em contato com:

Autor: Antônio Thiago e Hannah Sales
Email: atn.coding@gmail.com
GitHub: Antonio-coding HannahSales04
