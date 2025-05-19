package animales.casitaMascotas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:mysql://localhost:3306/la_casita",
		"spring.datasource.username=root",
		"spring.datasource.password="
})

class CasitaMascotasApplicationTests {

	@Test
	void contextLoads() {
	}

}
