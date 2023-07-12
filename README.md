## Configurações iniciais

spring.datasource.url=jdbc:postgresql://localhost:5432/{nome_do_seu_banco_de_dados}<br>
spring.datasource.username={seu_usuario}<br>
spring.datasource.password={sua_senha)<br>
spring.datasource.driver-class-name={seu_driver_de_conexao}<br>
spring.jpa.hibernate.ddl-auto= update<br>

### spring.jpa.hibernate.ddl-auto propriedade faz com que o spring data seja responsável em criar suas entidades.

- Client de requisição http utilizado foi o postman, caso não tenha, é possível obter o mesmo resultado pelo navegador.
- URL (exemplo) http://localhost:8080/pessoa/paginacao?pagina=0&itens=10

- ![image](https://github.com/matheuspieropan/spring-data-paginacao/assets/56203846/b02dfc3a-ed5b-4894-a645-9f78ce60e382)
