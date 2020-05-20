package elan.learn.demo.biz.auth.entity

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany

/**
 * @author 张一然
 * @date 2020/5/20 11:21
 */
@Entity
class Resource {
    @Id
    @GeneratedValue(generator = "SQ_RESOURCE")
    @Column(length = 11)
    Integer id

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "MT_ROLE_RESOURCE", inverseJoinColumns = @JoinColumn(name = "roleId"))
    Set<Role> roles = new HashSet<>()

    String name

    String authorityUrl

}
