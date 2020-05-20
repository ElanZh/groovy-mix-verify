package elan.learn.demo.biz.auth.entity

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*
/**
 * @author 张一然
 * @date 2020/5/20 9:50
 */
@Entity
class Role {
    @Id
    @GeneratedValue(generator = "SQ_ROLE")
    @Column(length = 11)
    Integer id

    /**
     * 角色名
     */
    @Column(nullable = false, unique = true)
    String roleName

    /**
     * 备注
     */
    @Lob
    String remark

    /**
     * 排序值，用于页面展示顺序，越小越靠前，默认为0
     */
    @Column(length = 9)
    Integer sort = 0

    /**
     * 被分配给的用户
     */
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    Set<Manager> managers = new HashSet<>()

    /**
     * 可以访问的资源
     */
    @ManyToMany(mappedBy = "roles")
    Set<Resource> resources = new HashSet<>()

}
