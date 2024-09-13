package org.group3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyFindAllWithoutManagerResponseDto {
    Long id;

    String name;

    List<ShiftFindAllWithoutManagerResponseDto> shifts;
}
