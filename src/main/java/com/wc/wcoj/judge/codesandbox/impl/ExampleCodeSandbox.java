package com.wc.wcoj.judge.codesandbox.impl;
import com.wc.wcoj.model.dto.questionsubmit.JudgeInfo;

import java.util.List;

import com.wc.wcoj.judge.codesandbox.CodeSandbox;
import com.wc.wcoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wc.wcoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.wc.wcoj.model.enums.JudgeInfoMessageEnum;
import com.wc.wcoj.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

/**
 *  示例代码沙箱（仅为了跑通业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }

}
