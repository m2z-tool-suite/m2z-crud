package com.m2z.tools.shared.mapper;

import com.m2z.tools.shared.dto.BaseDTO;
import com.m2z.tools.shared.model.BaseEntity;

import java.util.List;

public interface BaseMapper<Model extends BaseEntity<ID>, DTO extends BaseDTO<ID>, ID> {
    DTO toDTO(Model model);

    Model toModel(DTO DTO);

    List<DTO> toDTO(List<Model> model);

    List<Model> toModel(List<DTO> DTO);
}
