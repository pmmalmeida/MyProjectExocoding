package com.admin.codegenreallynew.mapper;

import com.admin.codegenreallynew.dto.somefolderx2.Tbl2ObjXdto;
import com.admin.codegenreallynew.model.somefolder.Tbl2Xx;
import com.admin.codegenreallynew.schema.Tbl2ObjXSchema;
import java.util.List;
import javax.annotation.processing.Generated;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@Component
@Mapper
public interface Tbl2ObjXMapper {

  @Mapping(target = "idTbl2Xx", source = "idTable2")
  Tbl2Xx dtoToEntity(Tbl2ObjXdto dto);

  List<Tbl2Xx> dtoToEntity(List<Tbl2ObjXdto> dtoList);

  Tbl2ObjXSchema dtoToSchema(Tbl2ObjXdto dto);

  List<Tbl2ObjXSchema> dtoToSchema(List<Tbl2ObjXdto> dtoList);

  @Mapping(target = "idTable2", source = "idTbl2Xx")
  Tbl2ObjXdto entityToDto(Tbl2Xx entity);

  List<Tbl2ObjXdto> entityToDto(List<Tbl2Xx> entityList);

  Tbl2ObjXdto schemaToDto(Tbl2ObjXSchema schema);

  List<Tbl2ObjXdto> schemaToDto(List<Tbl2ObjXSchema> schemaList);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(target = "idTbl2Xx", source = "idTable2")
  void updateFromDto(@MappingTarget Tbl2Xx entity, Tbl2ObjXdto dto);
}
