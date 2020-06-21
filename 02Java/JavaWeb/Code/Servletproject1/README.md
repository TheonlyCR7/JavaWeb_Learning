## 一个由servlet  mysql  实现的简单登录案例

目录结构
```
project1      // 根目录
├─ .idea      // Idea配置文件夹
├─ out
├─ project1.iml    // 项目配置文件夹
├─ src         // 类资源
│    ├─ SQL_user    // 操作数据库中User表的类
│    │    └─ UserDao.java
│    ├─ User        // 用户信息类
│    │    └─ User.java
│    ├─ druid.properties   // 配置文件  数据库信息
│    ├─ test        // 测试类
│    │    └─ UserDaoTest.java
│    ├─ util        // 创建连接池，mysql连接
│    │    └─ JDBCUtils.java
│    └─ web
│           └─ servlet
|           	└─ LoginServlet  // 登录成功判断控制
|           	└─ FailServlet  // 登录失败控制
|           	└─ SuccessServlet  // 登录成功控制
└─ web
       ├─ WEB-INF
       │    ├─ lib    	// 依赖的包
       │    └─ web.xml  // 配置文件
       ├─ index.jsp      
       └─ login.html    // 登录页面
```