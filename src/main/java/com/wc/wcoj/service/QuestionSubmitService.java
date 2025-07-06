package com.wc.wcoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wc.wcoj.model.dto.question.QuestionQueryRequest;
import com.wc.wcoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.wc.wcoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.wc.wcoj.model.entity.Question;
import com.wc.wcoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wc.wcoj.model.entity.User;
import com.wc.wcoj.model.vo.QuestionSubmitVO;
import com.wc.wcoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 流浪者
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2025-07-02 12:14:37
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);
    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
