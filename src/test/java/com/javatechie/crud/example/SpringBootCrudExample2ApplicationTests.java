/*
 * package com.javatechie.crud.example;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.when;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.mockito.InjectMocks; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.chubb.crud.example.entity.Product; import
 * com.chubb.crud.example.service.ProductService;
 * 
 * //@RunWith(SpringRunner.class)
 * 
 * @ContextConfiguration
 * 
 * @SpringBootTest class SpringBootCrudExample2ApplicationTests {
 * 
 * 
 * 
 * 
 * @InjectMocks ProductService productService;
 * 
 * 
 * @Test public void test_getProductById() { // Setup the mock repo int
 * productId = 1; Product product=new Product(1,"Raj",10,10.0);
 * when(productService.getProductById(productId)).thenReturn(product);
 * assertEquals(1,product.getId()); }
 * 
 * }
 */