package com.wc.wcoj.judge.strategy;

import com.wc.wcoj.model.dto.questionsubmit.JudgeInfo;

/**
 *  判题策略
 */
public interface JudgeStrategy {

    /**
     *  执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
