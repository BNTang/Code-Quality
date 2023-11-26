package top.it6666.单一职责.反例;

/**
 * 用户
 */
class User {
    private String name;
    private String email;

    // 构造函数、getters 和 setters
    // ...

    public void addUser(User user) {
        // 添加用户到数据库
    }

    public void deleteUser(User user) {
        // 从数据库删除用户
    }

    // 其他数据库相关方法
    // ...
}
