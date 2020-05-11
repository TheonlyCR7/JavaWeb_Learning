```java
使用分三步
1. 导包
例如: import java.util.Random;
2. 创建
Random r = new Random();
3. 使用
r.方法名(参数);
int num = r.nextInt();
```

## String

```java
// 程序中的所有双引号字符串，都是String 类的对象
特点
1. 字符串为不可变类型
2. 可共享
3. 效果上，等同于char[]字符数组，但是底层原理是byte[]字节数组
```

```java
三种创建方法
1. 创建空白字符
String str1 = new String();
System.out.println(str1);  // 为空
2. 根据字符数组创建字符串
char[] charArray = {'A', 'B', 'C'};
String str2 = new String(charArray);
System.out.println("string of two: " + str2);
3. 根据字节数组创建字符串
byte[] byteArray = {97, 98, 99};  // 对应字节码
String str3 = new String(byteArray);
System.out.println("string of three: " + str3);
```

### String常量池

```java
public static void main(String[] args){
	String str1 = "abc";
	String str2 = "abc";
	
	char[] charArray = {'a', 'b', 'c'};
	String str3 = new String(charArray);
	
	str1 == str2; // true
	str1 == str3; // false
	str2 == str3; // false
}
// 对于引用类型来说， == 进行的是地址值的比较
// 双引号直接写的字符在常量池中，new 的不在池中
```

![tupian](../photo/7.jpg)



### 常用方法

```

```



## Arrays数组工具类

```java
方法：
Arrays.toString(array);   // 将数组转为字符串
Arrays.sort(array);   // 数值从小到大排 字母升序排  为自定义类型需要Comparable / Comparator 接口的支持

```

## Math数学相关

```java
abc(double num); 获取绝对值
ceil(double num); 向上取整   ceil(3.1)  -- 4.0
floor(double num); 向下取整  floor(4.9) -- 4.0
round(double num); 四舍五入
```



## equals方法

**默认比较对象的地址值**

进行重写方法，比较两个对象的属性

```java
@Override 
public boolean equals(Object obj){
	// 转型判断
	if(obj instanceof Person){
		// 使用向下转型，把obj 转换为 Person类型
        Person p = new (Person)obj;
        // 比较两个对象的属性
        boolean b = this.name.equals(obj.name) && this.age == obj.age;
        return b;
	}
    // 无法转换直接 false
    return false;
}
```

