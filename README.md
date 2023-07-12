Configurações iniciais

spring.datasource.url=jdbc:postgresql://localhost:5432/{nome_do_seu_banco_de_dados}
spring.datasource.username={seu_usuario}
spring.datasource.password={sua_senha)
spring.datasource.driver-class-name={seu_driver_de_conexao}
spring.jpa.hibernate.ddl-auto= update   

spring.jpa.hibernate.ddl-auto propriedade faz com que o spring data seja responsável ao criar suas entidades.