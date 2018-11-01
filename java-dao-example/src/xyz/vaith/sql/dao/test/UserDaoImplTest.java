package test.xyz.vaith.sql.dao; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import xyz.vaith.sql.dao.UserDao;
import xyz.vaith.sql.dao.UserDaoImpl;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 30, 2018</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findAll() 
* 
*/ 
@Test
public void testFindAll() throws Exception { 
//TODO: Test goes here...
    UserDao dao = new UserDaoImpl();
    dao.findAll();
} 


} 
