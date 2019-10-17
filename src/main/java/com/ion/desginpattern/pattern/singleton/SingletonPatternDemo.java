package com.ion.desginpattern.pattern.singleton;

/**
 * 单例模式
 * <br>
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * <br>
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * <br>
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * <br>
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * <br>
 * 关键代码：构造函数是私有的。
 * <br>
 * 应用实例：
 * <br>
 * 1、一个班级只有一个班主任。
 * <br>
 * 2、Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。
 * <br>
 * 3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。
 * <br>
 * 优点：
 * <br>
 * 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
 * <br>
 * 2、避免对资源的多重占用（比如写文件操作）。
 * <br>
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 * <br>
 * 使用场景：
 * <br>
 * 1、要求生产唯一序列号。
 * <br>
 * 2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
 * <br>
 * 3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 * <br>
 * 注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
 * @author Ion
 */
public class SingletonPatternDemo {
}
