Projeto acadêmico desenvolvido para a FIAP – Engenharia de Software, na disciplina de Arquitetura Orientada a Serviços.
👨‍💻 Equipe

    Tony Segalin – RM 550667

    Henrique Parra - RM551973

    Roberto Oliveira - RM551460

# Energia Inteligente com Hidrogênio Verde ⚡💧

Este projeto é uma aplicação Java desenvolvida com Spring Boot que oferece uma solução inteligente para monitoramento energético e acionamento automático de backup com base em hidrogênio líquido. O objetivo é garantir fornecimento contínuo de energia em situações de falha na rede elétrica, utilizando arquitetura orientada a serviços (SOA) e integração com APIs externas.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
  - Web
  - Data JPA
  - Validation
  - Security (inicializado)
- H2 Database (runtime)
- PostgreSQL (opcional)
- Maven
- Lombok
- RestTemplate (para consumo de API externa)
- OpenWeatherMap API (previsão do tempo)
- Swagger/OpenAPI (documentação REST)

---

## 📦 Funcionalidades

- 🔍 Consulta ao status da rede elétrica e nível de hidrogênio
- 🔁 Acionamento automático de backup via célula a combustível
- 🌤️ Integração com API de clima (OpenWeather)
- 🧱 Separação em camadas (Controller, Service, Client, Model)
- 🔐 Preparado para autenticação e validações futuras
- 🧪 Estrutura inicial pronta para testes com Spring Boot

---

## 📁 Estrutura do Projeto

energia-inteligente-java/
├── src/
│ └── main/
│ ├── java/com/energiainteligente/
│ │ ├── controller/ # Endpoints REST
│ │ ├── service/ # Regras de negócio
│ │ ├── client/ # Consumo de API externa
│ │ ├── model/ # DTOs / Models
│ │ └── EnergiaInteligenteApplication.java
│ └── resources/
│ └── application.properties
└── pom.xml


---

## 🔌 Endpoints REST

### ✅ Verifica status da energia
```http
GET /energia/status

Resposta:

{
  "statusRede": "Indisponível",
  "nivelHidrogenio": "82%",
  "backupAtivo": false
}

✅ Aciona o sistema de backup

POST /energia/acionar/emergencia

Resposta:

{
  "mensagem": "Backup de energia com hidrogênio ativado."
}

⚙️ Como Executar Localmente
Requisitos

    JDK 17+

    Maven 3+

    Internet (para baixar dependências e usar a API de clima)

Passos

# Clone o repositório
git clone https://github.com/seu-usuario/energia-inteligente-java.git

# Acesse a pasta
cd energia-inteligente-java

# Compile e execute
mvn spring-boot:run

Acesse: http://localhost:8080/energia/status
🌍 Configuração da API OpenWeather

No arquivo application.properties, insira sua chave:

openweather.apikey=SUA_CHAVE_AQUI

Cadastre-se gratuitamente em: https://openweathermap.org/api
📄 Licença


📬 Contato

Dúvidas ou sugestões? Abra uma issue ou envie um pull request.


---

Se quiser, posso gerar um `README` alternativo em inglês, um diagrama de arquitetura ou uma versão com b
