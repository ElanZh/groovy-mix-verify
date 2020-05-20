package elan.learn.demo.biz.auth.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany

/**
 * @author 张一然
 * @date 2020/5/20 13:15
 */
@Entity
class Manager {
    @Id
    @GeneratedValue(generator = "SQ_MANAGER")
    @Column(length = 11)
    Integer Id

    @Column(unique = true)
    String username

    String password

    String md5Salt

    String phone

    String email

    /**
     * 拥有角色
     */
    @ManyToMany //(fetch = FetchType.EAGER)
    @JoinTable(name = "MT_MANAGER_ROLE", joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    Set<Role> roles = new HashSet<>()
}
