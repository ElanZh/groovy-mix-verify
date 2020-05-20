package elan.learn.demo.biz.auth.repo

import elan.learn.demo.biz.auth.entity.Resource
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface ResourceRepo extends JpaRepository<Resource, Integer>, JpaSpecificationExecutor<Resource> {

}