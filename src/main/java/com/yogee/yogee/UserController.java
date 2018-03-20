package com.yogee.yogee;

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
    // 创建线程安全的Map
    static Map<Long, UserEntity> UserEntitys = Collections.synchronizedMap(new HashMap<Long, UserEntity>());

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<UserEntity> getUserEntityList() {
        // 处理"/UserEntitys/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserEntity> r = new ArrayList<UserEntity>(UserEntitys.values());
        return r;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUserEntity(@ModelAttribute UserEntity UserEntity) {
        // 处理"/UserEntitys/"的POST请求，用来创建UserEntity
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        UserEntitys.put(UserEntity.getId(), UserEntity);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public UserEntity getUserEntity(@PathVariable Long id) {
        // 处理"/UserEntitys/{id}"的GET请求，用来获取url中id值的UserEntity信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return UserEntitys.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUserEntity(@PathVariable Long id, @ModelAttribute UserEntity UserEntity) {
        // 处理"/UserEntitys/{id}"的PUT请求，用来更新UserEntity信息
        UserEntity u = UserEntitys.get(id);
        u.setName(UserEntity.getName());
        u.setAge(UserEntity.getAge());
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
