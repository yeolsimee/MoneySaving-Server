package com.yeolsimee.moneysaving.app.common.response;

import lombok.*;

/**
 * packageName    : com.yeolsimee.moneysaving.app.common.response
 * fileName       : ResponseMessage
 * author         : jeon-eunseong
 * date           : 2023/02/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/26        jeon-eunseong       최초 생성
 */
@Getter
@AllArgsConstructor
public enum ResponseMessage {
    // 공통 에러메세지
    COMMON_SYSTEM_ERROR("일시적인 오류가 발생했습니다. 잠시 후 다시 시도해주세요."), // 장애 상황
    COMMON_INVALID_PARAMETER("요청한 값이 올바르지 않습니다."),
    COMMON_ENTITY_NOT_FOUND("존재하지 않는 엔티티입니다."),
    COMMON_ILLEGAL_STATUS("잘못된 상태값입니다."),

    // USER 에러코드
    AUTH_USER("사용자 정보가 없습니다.");

    final String message;
}
