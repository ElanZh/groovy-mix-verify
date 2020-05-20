package elan.learn.demo.biz.auth.repo

import elan.learn.demo.biz.auth.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface RoleRepo extends JpaRepository<Role, Integer>, JpaSpecificationExecutor<Role> {

}