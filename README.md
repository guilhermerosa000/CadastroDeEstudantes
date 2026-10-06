# 🎓 Cadastro de Estudantes

API REST para cadastro de estudantes e cursos, desenvolvida com **Java** e **Spring Boot**. O projeto faz parte dos meus estudos de back-end e demonstra o uso de Spring Web, Spring Data JPA e relacionamento entre entidades com MySQL.

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.5-6DB33F?logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8-4479A1?logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-build-C71A36?logo=apachemaven&logoColor=white)

## 📋 Sobre o projeto

A aplicação gerencia estudantes e os cursos em que estão matriculados. Cada estudante pertence a **um curso**, e cada curso pode ter **vários estudantes** (relacionamento `@ManyToOne` / `@OneToMany`).

### Funcionalidades atuais

- [x] Listar todos os estudantes
- [ ] Cadastrar estudante
- [ ] Buscar estudante por ID
- [ ] Atualizar estudante
- [ ] Remover estudante
- [ ] CRUD de cursos

## 🛠️ Tecnologias

- [Java 17](https://openjdk.org/projects/jdk/17/)
- [Spring Boot 4.0.5](https://spring.io/projects/spring-boot)
  - Spring Web MVC
  - Spring Data JPA (Hibernate)
- [MySQL](https://www.mysql.com/) + MySQL Connector/J
- [Lombok](https://projectlombok.org/)
- [Maven](https://maven.apache.org/) (com Maven Wrapper)

## 🗂️ Estrutura do projeto

```
src/main/java/spring/estudos/Cadastro
├── CadastroApplication.java        # Classe principal
├── Estudantes
│   ├── EstudanteController.java    # Endpoints REST
│   ├── EstudanteModel.java         # Entidade Estudante
│   └── EstudanteRepository.java    # Repositório JPA
└── Cursos
    └── CursosModel.java            # Entidade Curso
```

## 🧩 Modelo de dados

| Tabela        | Campos                                                          |
| ------------- | --------------------------------------------------------------- |
| `tb_cadastro` | `id`, `nome`, `email`, `idade`, `cursos_id` (FK → `tb_cursos`)  |
| `tb_cursos`   | `id`, `nome`, `carga_horaria`                                   |

As tabelas são criadas automaticamente pelo Hibernate (`spring.jpa.hibernate.ddl-auto=update`).

## ✅ Pré-requisitos

- JDK 17 ou superior
- MySQL em execução na porta `3306`
- Git

## 🚀 Como executar

**1. Clone o repositório**

```bash
git clone https://github.com/guilhermerosa000/CadastroDeEstudantes.git
cd CadastroDeEstudantes
```

**2. Crie o banco de dados**

```sql
CREATE DATABASE springteste;
```

**3. Configure as variáveis de ambiente**

O usuário e a senha do banco são lidos de variáveis de ambiente, para não ficarem expostos no código.

Linux / macOS:

```bash
export DB_USER=seu_usuario
export DB_PASS=sua_senha
```

Windows (PowerShell):

```powershell
$env:DB_USER="seu_usuario"
$env:DB_PASS="sua_senha"
```

> Se necessário, ajuste a URL de conexão em `src/main/resources/application.properties`
> (padrão: `jdbc:mysql://localhost:3306/springteste`).

**4. Execute a aplicação**

Linux / macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```bash
mvnw.cmd spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## 📡 Endpoints

| Método | Rota           | Descrição                    |
| ------ | -------------- | ---------------------------- |
| `GET`  | `/estudantes`  | Lista todos os estudantes    |

### Exemplo de resposta

`GET /estudantes`

```json
[
  {
    "id": 1,
    "nome": "Maria Silva",
    "email": "maria@email.com",
    "idade": 20,
    "curso": {
      "id": 1,
      "nome": "Engenharia de Software",
      "cargaHoraria": 3600
    }
  }
]
```

## 🧪 Testes

```bash
./mvnw test
```

## 🔮 Próximos passos

- Implementar os demais endpoints do CRUD (POST, PUT, DELETE)
- Criar controller e repositório de cursos
- Adicionar validações com Bean Validation
- Utilizar DTOs para entrada e saída de dados
- Tratamento global de exceções
- Documentação com Swagger / OpenAPI

## 👨‍💻 Autor

Feito por **Guilherme Rosa**

[![GitHub](https://img.shields.io/badge/GitHub-guilhermerosa000-181717?logo=github)](https://github.com/guilhermerosa000)
