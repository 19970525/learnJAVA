>之前老的servlet技术（JSP），通过servlet的实现类HttpServlet的doGet、doPost等方法接收请求
> 上下文监听器：ServletContextListener类

# 1.Spring MVC概念

> MVC是模型(Model)、视图(View)、控制器(Controller)的简写，是一种软件设计规范
>
> 是将业务逻辑、数据、显示分离的方法来组织代码
>
> MVC主要作用是**降低了视图与业务逻辑间的双向偶合**
>
> MVC不是一种设计模式，**MVC是一种架构模式**。当然不同的MVC存在差异。

**Model（模型）**——servlet中的dao、service

**View（视图）**——servlet中的jsp页面

**Controller（控制器）**——servlet中controller

> 常见的服务器端MVC框架有：Struts、Spring MVC、ASP.NET MVC、Zend Framework、JSF；
>
> 常见前端MVC框架：vue、angularjs、react、backbone；
>
> 由MVC演化出了另外一些模式如：MVP、MVVM 等等

概念：

> Spring MVC是Spring Framework的一部分，是基于Java实现MVC的轻量级Web框架。

特点：

> 约定优于配置
>
> 功能强大：RESTful、数据验证、格式化、本地化、主题等
>
> Spring的web框架围绕**DispatcherServlet** [ 调度Servlet ] 设计

# 2.DispatcherServlet

![image-20210906094048252](.\images\image-20210906094048252.png)

SpringMVC的核心就是DispatcherServlet，DispatcherServlet实质也是一个HttpServlet。DispatcherSevlet负责将请求分发，所有的请求都有经过它来统一分发。

  大致看下SpringMVC请求处理的流程：

![image-20210902105840042](.\images\image-20210902105840042.png)

![](.\images\DispatcherServlet2.png)

![](.\images\DispatcherServlet1.png)

![](.\images\springMVC原理.png)

> DispatcherServlet中使用的特殊的Bean：
>
> DispatcherServlet默认使用WebApplicationContext作为上下文，该上下文中特殊的Bean有：
>
> 1、Controller：
>
> 处理器/页面控制器，做的是MVC中的C的事情，但控制逻辑转移到前端控制器了，用于对请求进行处理；
>
> 2、HandlerMapping：
>
> 请求到处理器的映射，如果映射成功返回一个HandlerExecutionChain对象
>
> （**包含一个Handler处理器（页面控制器）对象、多个HandlerInterceptor拦截器**）对象；
>
> 如BeanNameUrlHandlerMapping将URL与Bean名字映射，映射成功的Bean就是此处的处理器；
>
> 3、HandlerAdapter：
>
> HandlerAdapter将会把处理器包装为适配器，从而支持多种类型的处理器，即**适配器设计模式**的应用，
>
> 从而很容易支持很多类型的处理器；
>
> 如SimpleControllerHandlerAdapter将对实现了Controller接口的Bean进行适配，
>
> 并且按处理器的handleRequest方法进行功能处理；
>
> 4、ViewResolver：
>
> ViewResolver将把逻辑视图名解析为具体的View，通过这种**策略模式**，很容易更换其他视图技术；
>
> 如InternalResourceViewResolver将逻辑视图名映射为jsp视图；
>
> 5、LocalResover：
>
> 本地化解析，因为Spring支持国际化，因此LocalResover解析客户端的Locale信息从而方便进行国际化；
>
> 6、ThemeResovler：
>
> 主题解析，通过它来实现一个页面多套风格，即常见的类似于软件皮肤效果；
>
> 7、MultipartResolver：
>
> 文件上传解析，用于支持文件上传；
>
> 8、HandlerExceptionResolver：
>
> 处理器异常解析，可以将异常映射到相应的统一错误界面，从而显示用户友好的界面（而不是给用户看到具体的错误信息）；
>
> 9、RequestToViewNameTranslator：
>
> 当处理器没有返回逻辑视图名等相关信息时，自动将请求URL映射为逻辑视图名

# 3.第一个Spring MVC项目

### 1.Spring MVC完全配置方式：

web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">

    <!-- 狂神 web application方式 -->
    <!-- 注册DispatcherServlet -->
    <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <!-- 关联一个SpringMVC配置文件  【servlet-name】-servlet.xml -->
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc-servlet.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <!-- / 匹配所有请求（不包括.jsp） -->
    <!-- /* 匹配所有请求（包括.jsp） -->
    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
</web-app>
```

web.xml中DispatcherServlet关联的配置文件：【springMVC名称-servlet.xml】

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 处理器映射器 -->
    <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
    <!-- 处理器适配器 -->
    <bean class="org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"/>

    <!-- 视图解析器 -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <!-- 前缀 -->
        <property name="prefix" value="/WEB-INF/"/>
        <!-- 后缀 -->
        <property name="suffix" value=".jsp"/>
    </bean>

    <import resource="spring-dev.xml"/>
</beans>
```

引入的bean文件：spring-dev.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="/hello" class="org.cloud.controller.HelloController"/>
</beans>
```

Controller层：

```java
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "你好，世界66666666666666！");
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }
}
```

渲染的JSP文件：helloWorld.jsp

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${msg}</h3>
</body>
</html>
```

### 2.优化核心配置：

优化【springMVC名称-servlet.xml】文件：（开启注解）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/mvc
       http://www.springframework.org/schema/mvc/spring-mvc.xsd">

    <context:component-scan base-package="org.cloudcore.controller"/>
    <!-- 让Spring MVC不处理静态资源 -->
    <mvc:default-servlet-handler/>
    <!--
    支持mvc注解驱动
    在spring中一般采用@RequestMapping注解来完成映射关系
    要想使@RequestMapping注解生效
    必须向上下文中注册DefaultAnnotationHandlerMapping
    和一个AnnotationMethodHandlerAdapter实例
    这两个实例分别在类级别和方法级别处理。
    而annotation-driven配置帮助我们自动完成上述两个实例的注入。
 -->
    <mvc:annotation-driven/>


    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
</beans>
```

Controller层：

```java
@Controller
public class BatchTransferController {

    @RequestMapping("/transferMoney")
    public String transfer(Model model) {
        model.addAttribute("msg","转账1000000.00元！");
        return "pay";
    }
}
```

# 4.Spring MVC的其他常用注解：

### 1.@RequestMapping ——@GetMapping / @PostMapping / @DeleteMapping /@ PutMapping

> RequestMapping配置请求路由，具体请求方式可以method属性设置，也可用其他的几个注解代替，使用RequestMapping默认get请求方式

```java
@Controller
public class BatchTransferController {

//    @RequestMapping(value = "/transferMoney/{p1}/{p2}", method = {RequestMethod.GET})
//    @RequestMapping("/transferMoney/{p1}/{p2}")
    @GetMapping("/transferMoney/{p1}/{p2}")
    public String transfer(Model model, @PathVariable int p1, @PathVariable int p2) {
        model.addAttribute("msg","转账" + (p1+p2) + "元！");
        return "pay";
    }
}
```

### 2.Restful风格url注解：@PathVariable

```java
@Controller
public class BatchTransferController {

    @GetMapping("/transferMoney/{p1}/{p2}")
    public String transfer(Model model, @PathVariable int p1, @PathVariable int p2) {
        model.addAttribute("msg","转账" + (p1+p2) + "元！");
        return "pay";
    }
}
```

### 3.请求参数处理注解：@RequestParam
>当想要自定义参数名称可使用该注解，不自定义参数名称无需使用

```java
@Controller
public class BatchTransferController {

    @GetMapping("/transfer1")
    public String transfer1(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "pay";
    }

    //如果请求参数太多，可以封装一个javaBean，直接写类名称，不用注解！
    @GetMapping("/transfer2")
    public String transfer2(Model model, TransferFrom transferFrom) {
        System.out.println(transferFrom.getUname());
        System.out.println(transferFrom.getTotal());
        model.addAttribute("msg", transferFrom.getUname() + "转了" + transferFrom.getTotal() + "元");
        return "pay";
    }
}
```

```java
public class TransferFrom {

    private String uname;
    private double total;

    public TransferFrom(String uname, double total) {
        this.uname = uname;
        this.total = total;
    }
    
    ...setter、getter方法
 }
```

# 5.转发和重定向

> 1.Servlet原生方式
>
> 2.使用视图解析器
>
> 1. 转发：
>    - forward:前端文件全路径 或则  直接文件名称
> 2. 重定向：
>    - redirect:前端文件全路径  
>    - 文件不要创建在WEB-INF目录下，否则重定向访问不到
>    - 模板视图传递参数，页面接收不到
>
> 3.不使用视图解析器
>
> 1. 转发：
>    - forward:前端文件全路径
> 2. 重定向：
>    - redirect:前端文件全路径  
>    - 文件不要创建在WEB-INF目录下，否则重定向访问不到
>    - 模板视图传递参数，页面接收不到
> 
> (//转发<br/>
>return "hello";<br/>
>//也可以写成return "forward:/WEB-INF/jsp/hello.jsp";<br/>
>//注意：转发可以分为显式forward和不写forward，不写的时候会走视图解析器，<br/>
>//写了的时候则不走视图解析器的！！<br/>
>
>//重定向：在返回的地址前加上 redirect:<br/>
>// 重定向的话，代表浏览器重新访问服务器，不会走视图解析器。<br/>
>// 因为浏览器没有权限访问web-inf目录，故如果重定向地址是在web-inf下的页面，则会报错<br/>
>return "redirect:/index.jsp";)<br/>

``` java
    //无需视图解析器
    @GetMapping("/transfer2")
    public String transfer2(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "forward:/WEB-INF/pay.jsp";
    }

    //无需视图解析器 重定向无法找到WEB-INF目录下的文件，将文件建在WEB-INF之外  重定向目标页面无法获取模板视图的参数
    @GetMapping("/transfer3")
    public String transfer3(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        System.out.println(model.getAttribute("msg"));
        System.out.println(uname);
        return "redirect:/jsp/pay2.jsp";
    }
```

> 注意：**重定向**会增加http请求的次数，会影响到整个网站的性能，但是必要的重定向又可以提高用户体验，所以我们需要在性能和用户体验之间去权衡，达到最好的目的。
>
> ![image-20210906100855679](.\images\image-20210906100855679.png)
>
> 下面讲讲php实现**301永久重定向**和**302临时重定向**以及怎么去避免重定向：
>
> 1、在定义链接地址的href属性的时候，尽量使用最完整的、直接的地址。例如
>
> 使用www.cnblogs.com 而不是cnblogs.com
>
> 2、在使用Response.Redirect的时候，设置第二个参数为false
>
> 3、如果涉及到从测试环境到生产环境的迁移，建议通过DNS中的CNAME的机制来定义别名，而不是强制地重定向来实现

# 6.简单了解几种返回的模板视图

> Model 只有寥寥几个方法只适合用于储存数据，简化了新手对于Model对象的操作和理解；
>
> ModelMap 继承了 LinkedMap ，除了实现了自身的一些方法，同样的继承 LinkedMap 的方法和特性；
>
> ModelAndView 可以在储存数据的同时，可以进行设置返回的逻辑视图，进行控制展示层的跳转。

# 7.乱码解决

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    
    <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc-servlet.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
    
    <!-- 过滤器设置编码 -->
    <filter>
        <filter-name>encoding</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>utf-8</param-value>
        </init-param>
    </filter>

    <filter-mapping>
        <filter-name>encoding</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
</web-app>
```

# 8.JSON

![](.\images\48590-20170527140316950-1204883095.png)

> @RequestBody：用于读取http请求的内容，通过springmvc提供的**HttpMessageConverter接口**将读到的内容（json数据）转换为java对象。
>
> @ResponseBody：用于将Controller的方法返回的对象，通过springmvc提供的**HttpMessageConverter接口**转换为指定格式的数据如：json,xml等，通过Response响应给客户端。
>
> 注意：JSON一定要后端定义需要的JavaBean！

- 需要Jackson依赖

- 使用默认配置<mvc:annotation-driven />

``` java
      @PostMapping("/transfer")
  	//@ResponseBody 			/*@ResponseBody也可以写在这里*/
      public @ResponseBody List<Users> transfer(@RequestBody Users users) {
          System.out.println(users.toString());
          System.out.println(users.getBoyfriend_id());
          ArrayList<Users> users1 = new ArrayList<>();
          users1.add(users);
          users1.add(users);
          users1.add(users);
          users1.add(users);
          return users1;
      }
  ```

  结果：

  ![image-20210906194253281](.\images\image-20210906194253281.png)

# 9.Ajax

# 10.拦截器

> **过滤器**
>
> - servlet规范中的一部分，任何java web工程都可以使用
> - 在url-pattern中配置了/*之后，可以对所有要访问的资源进行过滤
>
> **拦截器** 
>
> - 拦截器基于AOP
> - 拦截器是SpringMVC框架自己的，只有使用了SpringMVC框架的工程才能使用
> - 拦截器只会拦截访问的控制器方法， 如果访问的是jsp/html/css/image/js是不会进行拦截的

```xml
    <mvc:interceptors>
        <mvc:interceptor>
            <mvc:mapping path="/**" />
            <bean class="org.cloudcore.interceptor.MyInterceptor" />
        </mvc:interceptor>
    </mvc:interceptors>
```

```java
//自定义请求拦截器
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==============拦截请求处理前==================");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==============拦截请求处理后(业务方法不通过，该方法不会执行，在业务方法后执行)==================");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("==============拦截请求完成最终执行==================");
    }
}
```

案例：用户登录，拦截器使用HttpSession验证是否登录

# 11.文件上传和下载