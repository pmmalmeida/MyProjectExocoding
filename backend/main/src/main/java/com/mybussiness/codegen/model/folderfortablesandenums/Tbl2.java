package com.mybussiness.codegen.model.folderfortablesandenums;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.annotation.processing.Generated;
import lombok.Data;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@Data
@Entity
@Table
public class Tbl2 extends AbstractEntity {

  @Column(name = "idTBL2")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long idTbl2;
}
