# spi(service provider interface)
>## 简要介绍
+ java的一种服务发现机制
+ 一个服务通常指的是已知的接口或者抽象类，服务提供方就是对这个接口或者抽象类的实现，而不同的服务提供商有不同的实现。
+ spi标准存放到资源路径META-INF/services目录下，文件的命名为该服务接口的全限定名。
+ 服务提供商只要实现定义好的接口，然后按照spi标准打包成jar，再放到classpath下就可以了。
>## 下面是一个简单的demo
1. 首先定义一个接口 Search，有一个按关键字查询的方法
2. 两个实现类DBSearch和FileSearch
3. /META-INF/services 下创建文件名为接口类名的文件
4. SearchFactory工厂类，主要是通过ServiceLoader加载定义好的接口实现
5. 测试