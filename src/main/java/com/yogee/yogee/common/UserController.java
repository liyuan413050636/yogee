package com.yogee.yogee.common;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Demo class
 *
 * @author Jackqth
 * @date 2018/3/20
 */
@RestController
@RequestMapping(value="/UserEntitys")     // 通过这里配置使下面的映射都在/UserEntitys下
public class UserController {
    /**创建线程安全的Map*/
    static Map<Long, User> UserEntitys = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value="/getUser", method= RequestMethod.GET)
    public List<User> getUserEntityList() {
        // 处理"/UserEntitys/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<User> r = new ArrayList<User>(UserEntitys.values());
        return r;
    }

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public String postUserEntity(@ModelAttribute User User) {
        // 处理"/UserEntitys/"的POST请求，用来创建UserEntity
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        UserEntitys.put(User.getId(), User);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUserEntity(@PathVariable Long id) {
        // 处理"/UserEntitys/{id}"的GET请求，用来获取url中id值的UserEntity信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return UserEntitys.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUserEntity(@PathVariable Long id, @ModelAttribute User User) {
        // 处理"/UserEntitys/{id}"的PUT请求，用来更新UserEntity信息
        User u = UserEntitys.get(id);
        u.setName(User.getName());
        u.setAge(User.getAge());
        UserEntitys.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUserEntity(@PathVariable Long id) {
        // 处理"/UserEntitys/{id}"的DELETE请求，用来删除UserEntity
        UserEntitys.remove(id);
        return "success";
    }
}
