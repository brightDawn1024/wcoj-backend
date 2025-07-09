package com.wc.wcoj.judge;

import com.wc.wcoj.judge.strategy.DefaultJudgeStrategy;
import com.wc.wcoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.wc.wcoj.judge.strategy.JudgeContext;
import com.wc.wcoj.judge.strategy.JudgeStrategy;
import com.wc.wcoj.model.dto.questionsubmit.JudgeInfo;
import com.wc.wcoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 *  判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     *  执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }


}
