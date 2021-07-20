package OPP.test;

import org.junit.*;
import static org.junit.Assert.*;


/*
@Test：把一个方法标记为测试方法
@Before：每一个测试方法执行前自动调用一次
@After：每一个测试方法执行完自动调用一次
@BeforeClass：所有测试方法执行前执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
@AfterClass：所有测试方法执行完执行一次，在测试类还没有实例化就已经被加载，所以用static修饰
@Ignore：暂不执行该测试方法
 */

// 测试单元类
public class AnnotationTest {
    public AnnotationTest() {
        System.out.println("构造方法");
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Ignore
    public void test3() {
        System.out.println("test3");

    }
}
