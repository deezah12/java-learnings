package com.teamapt.dcir.lib.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class ParticipantDto {

    @NotBlank
    @Size(min = 1, max = 35)
    private String participantCode;

    @NotBlank
    @Size(min = 1, max = 35)
    private String chargeCode;

    @NotBlank
    @Size(min = 1, max = 35)
    private String accountNumber;

    @Size(max = 128)
    private String accountName;
}
