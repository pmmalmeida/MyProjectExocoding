package com.admin.codegenreallynew.repos;

import com.admin.codegenreallynew.model.somefolder.Tbl2Xx;
import javax.annotation.processing.Generated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@Repository
public interface Tbl2XxRepository
    extends JpaRepository<Tbl2Xx, Long>, JpaSpecificationExecutor<Tbl2Xx> {}
