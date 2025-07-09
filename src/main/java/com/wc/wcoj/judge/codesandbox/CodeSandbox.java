package com.wc.wcoj.judge.codesandbox;

import com.wc.wcoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wc.wcoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     *  执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
