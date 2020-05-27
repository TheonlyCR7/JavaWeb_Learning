package test;

import Demo1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// 单元测试类
public class CalculatorTest {
    // 初始化方法
    // 用于资源申请，所有测试方法在执行之前都会先执行该方法
    @Before
    public void init(){
        System.out.println("init...");
    }

    // 释放资源方法
    // 在所有测试方法执行完后，都会自动执行该方法
    @After
    public void close(){
        System.out.println("close...");
    }

    // 测试 add 方法
    @Test
    public void testadd(){

        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        // Assert.assertEquals(期望值, 实际结果);
        Assert.assertEquals(2, result);
    }
}
