package br.com.oportuna.apontamentosb;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApontamentosbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApontamentosbApplication.class, args);
	}
	
	/*@Bean
	public DataSource dataSouce() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/apontamento");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		return dataSource;
	}*/
}
