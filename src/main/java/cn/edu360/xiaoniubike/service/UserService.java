package cn.edu360.xiaoniubike.service;

import cn.edu360.xiaoniubike.pojo.User;

public interface UserService {
    boolean sendMsg(String phoneNum);

    boolean verify(String phoneNum, String verifyCode);

    void register(User user);

    void update(User user);

//    void identify(User user);
}
