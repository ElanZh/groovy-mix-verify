package elan.learn.demo.biz.auth.ctrl

import elan.learn.demo.biz.auth.entity.Role
import elan.learn.demo.biz.auth.repo.RoleRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 * @author 张一然
 * @date 2020/5/20 15:11
 *
 */
@RestController
@RequestMapping("role")
class RoleCtrl {
    @Autowired
    RoleRepo roleRepo

    @PostMapping("add")
    Role add(@RequestBody Role req) {
        return roleRepo.saveAndFlush(req)
    }
}
