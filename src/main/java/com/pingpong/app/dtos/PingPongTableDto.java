package com.pingpong.app.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pingpong.app.entities.PingPongTable;
import com.pingpong.app.models.Coordinates;
import com.pingpong.app.utils.BaseDto;
import lombok.*;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PingPongTableDto extends BaseDto<PingPongTable> {
    private Integer id;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private Coordinates coordinates;
    @NotNull
    private String description;
    private String imageUrl;
    private Boolean hasLight;
    private Boolean isIndoor;
    private Boolean isSportsClub;
    private Boolean isBar;
    private Integer createdBy;
}
