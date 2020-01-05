package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.product.Product;
import com.in28minutes.rest.webservices.restfulwebservices.product.ProductRepository;
import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import com.in28minutes.rest.webservices.restfulwebservices.todo.TodoJpaRepository;

@Component
public class TodoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private TodoJpaRepository todoRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		todoRepository.deleteAll();
		todoRepository.save(new Todo(10001L, "in28minutes", "Learn to Microservices", new Date(), false));
		todoRepository.save(new Todo(10002L, "in28minutes", "Learn to Spring Boot", new Date(), false));
		todoRepository.save(new Todo(10003L, "in28minutes", "Learn to AWS", new Date(), false));
		productRepository.deleteAll();
		productRepository.save(new Product("5901234123457", "Weck 100 ml Deli Kavanoz 757", 1500));
		productRepository.save(new Product("5901234123457", "Weck 100 ml Deli Kavanoz 757", 1500));
		productRepository.save(new Product("8691065900019", "Weck 100 ml Deli Kavanoz 757", 1500));
		productRepository.save(new Product("8691065900026", "Weck 200 ml Deli Kavanoz 995", 1500));
		productRepository.save(new Product("8691065900033", "Weck 370 ml Deli Kavanoz 996", 1500));
		productRepository.save(new Product("8691065900040", "Weck 220 ml Lale Kavanoz 762", 1500));
		productRepository.save(new Product("8691065900057", "Weck 35 ml Mold Kavanoz 756", 1500));
		productRepository.save(new Product("8691065900064", "Weck 80 ml Mold Kavanoz 080", 1500));
		productRepository.save(new Product("8691065900071", "Weck 140 ml Mold Uzun Kavanoz 761", 1500));
		productRepository.save(new Product("8691065900088", "Weck 160 ml Mold Uzun Kavanoz 760", 1500));
		productRepository.save(new Product("8691065900095", "Weck 370 ml Mold Kısa Kavanoz 741", 1500));
		productRepository.save(new Product("8691065900101", "Weck 290 ml Mold Kısa Kavanoz 740", 1500));
		productRepository.save(new Product("8691065900118", "Weck 290 ml Mold Uzun Kavanoz 900", 1500));
		productRepository.save(new Product("8691065900125", "Weck 580 ml Mold Uzun Kavanoz 742", 1500));
		productRepository.save(new Product("8691065900132", "Weck 220 ml Deco Kavanoz 902", 1500));
		productRepository.save(new Product("8691065900149", "Weck 560 ml Deco Kavanoz 901", 1500));
		productRepository.save(new Product("8691065900156", "Weck 290 ml Juice Kavanoz 763", 1500));
		productRepository.save(new Product("8691065900163", "Weck 340 ml Silindir Kavanoz 975", 1500));
		productRepository.save(new Product("8691065900170", "Weck 600 ml Silindir Kavanoz 905", 1500));
		productRepository.save(new Product("8691065900187", "Weck 370 ml Lale Kavanoz 746", 1500));
		productRepository.save(new Product("8691065900194", "Weck 1062 ml Deco Kavanoz 748", 1500));
		productRepository.save(new Product("8691065900200", "Weck 850 ml Mold Uzun Kavanoz 743", 1500));
		productRepository.save(new Product("8691065900217", "Weck 1590 ml Silindir Kavanoz 974", 1500));
		productRepository.save(new Product("8691065900255", "Weck 40 mm Cam Kavanoz Kapağı 9090639", 1500));
		productRepository.save(new Product("8691065900262", "Weck 60 mm Cam Kavanoz Kapağı 9090415", 1500));
		productRepository.save(new Product("8691065900279", "Weck 80 mm Cam Kavanoz Kapağı 9090464", 1500));
		productRepository.save(new Product("8691065900286", "Weck 100 mm Cam Kavanoz Kapağı 9090431", 1500));
		productRepository.save(new Product("8691065900293", "Weck 40 mm Turuncu Lastik Conta 8039155", 1500));
		productRepository.save(new Product("8691065900309", "Weck 60 mm Turuncu Lastik Conta 8054114", 1500));
		productRepository.save(new Product("8691065900316", "Weck 80 mm Turuncu Lastik Conta 8074112", 1500));
		productRepository.save(new Product("8691065900323", "Weck 100 mm Turuncu Lastik Conta 8094102", 1500));
		productRepository.save(new Product("8691065900347", "Weck 100 mm Ahşap Kavanoz Kapağı", 1500));
		productRepository.save(new Product("8691065900521", "Weck 60 mm Plastik Kavanoz Kapağı", 1500));
		productRepository.save(new Product("8691065900538", "Weck 80 mm Plastik Kavanoz Kapağı", 1500));
		productRepository.save(new Product("8691065900545", "Weck 100 mm Plastik Kavanoz Kapağı", 1500));
		productRepository.save(new Product("8691065900736", "Weck 1062 ml Juice Kavanoz 766", 1500));
		productRepository.save(new Product("8691065900811", "Weck 1062 ml Deco Ahşap Kapaklı Kavanoz 748", 1500));
		productRepository.save(new Product("8691065900835", "Weck 580 ml Mold Uzun Ahşap Kapaklı Kavanoz 742", 1500));
		productRepository.save(new Product("8691065901542", "Weck 1050 ml Mold Kavanoz 782", 1500));
		productRepository.save(new Product("8691065901559", "Weck 1062 ml Lale Kavanoz 745", 1500));
		productRepository.save(new Product("8691065901566", "Weck 530 ml Juice Kavanoz 764", 1500));
		productRepository.save(new Product("8691065901573", "Weck 165 ml Mold Kavanoz 976", 1500));
		productRepository.save(new Product("8691065901658", "Weck 580 ml Lale Kavanoz 744", 1500));
	}
}
