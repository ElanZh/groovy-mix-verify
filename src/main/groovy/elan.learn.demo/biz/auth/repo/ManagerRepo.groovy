package elan.learn.demo.biz.auth.repo

import elan.learn.demo.biz.auth.entity.Manager
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface ManagerRepo extends JpaRepository<Manager, Integer>, JpaSpecificationExecutor<Manager> {

}