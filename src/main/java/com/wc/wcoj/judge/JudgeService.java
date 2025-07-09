package com.wc.wcoj.judge;

import com.wc.wcoj.model.entity.QuestionSubmit;

/**
 *  判题服务
 */
public interface JudgeService {

    /**
     *  判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
